package com.Javabootcamp.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	public void configuration(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.jdbcAuthentication()
			.usersByUsernameQuery("select username from tblm_user")
			.and();
		
	}
}
