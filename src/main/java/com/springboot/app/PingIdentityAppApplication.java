package com.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.springboot.app.model.Response;

@SpringBootApplication
@EnableWebSecurity
public class PingIdentityAppApplication {

//	@Bean
//	JedisConnectionFactory jedisConnectionFactory(){
//		return new JedisConnectionFactory();
//	}
//	
//	@Bean 
//	RedisTemplate<String, Response> redisTemplate(){
//		RedisTemplate<String, Response> redisTemplate = new RedisTemplate<String, Response>();
//		redisTemplate.setConnectionFactory(jedisConnectionFactory());
//		return redisTemplate;
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(PingIdentityAppApplication.class, args);
	}

}
