package com.springboot.app.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user_a").password("psw_a").roles("user");
		auth.inMemoryAuthentication().withUser("user_b").password("psw_b").roles("user");
		auth.inMemoryAuthentication().withUser("user_c").password("psw_c").roles("user");
		auth.inMemoryAuthentication().withUser("user_d").password("psw_d").roles("admin");
		auth.inMemoryAuthentication().withUser("user_e").password("psw_e").roles("admin");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
//		http.authorizeRequests().antMatchers("SecuredTouch/rest/v2/sessions").hasAnyRole("admin").anyRequest()
//				.fullyAuthenticated().and().httpBasic();
//		http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
		http.authorizeRequests().anyRequest().permitAll();
	}

}
