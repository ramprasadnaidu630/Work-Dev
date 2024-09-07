package com.security.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurity {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//		it will be using for token stop
//		httpSecurity.csrf(custiomizer->custiomizer.disable());
		
//		it will use the adding login form in the project
		httpSecurity.authorizeHttpRequests(requesr->requesr.anyRequest().fullyAuthenticated());
		httpSecurity.formLogin(Customizer.withDefaults());
		
		httpSecurity.httpBasic(Customizer.withDefaults());
		httpSecurity.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

		return httpSecurity.build();
	}
}
