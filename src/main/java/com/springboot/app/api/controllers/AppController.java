package com.springboot.app.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.api.config.JwtTokenUtil;
import com.springboot.app.model.Counters;
import com.springboot.app.model.JwtResponse;
import com.springboot.app.model.User;
import com.springboot.app.model.UserType;
import com.springboot.app.service.CountersService;
import com.springboot.app.service.SessionsService;
import com.springboot.app.service.UserService;

@RequestMapping("SecuredTouch/rest/v2")
@RestController
public class AppController {

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private CountersService countersService;

	@Autowired
	private SessionsService sessionsService;

	@Autowired
	private UserService userService;

	@PostMapping(path = "/auth")
	public ResponseEntity<JwtResponse> authUser(@RequestBody User user) {
		String token = jwtTokenUtil.generateToken(user);
		userService.addToken(user.getUserName(), token);
		return ResponseEntity.ok(new JwtResponse(token));
	}

	@GetMapping(path = "/counters")
	public Counters getCounters(@RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
		return countersService.getCounters();
	}

	@GetMapping(path = "/sessions")
	public ResponseEntity<?> getSessions(@RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
		UserType userType = userService.getUserTypeByToken(token);
		if (userType != null && userType.equals(UserType.ADMIN)) {
			return ResponseEntity.ok().body(sessionsService.getSessions());
		}
		return new ResponseEntity<String>(HttpStatus.UNAUTHORIZED);
	}
}
