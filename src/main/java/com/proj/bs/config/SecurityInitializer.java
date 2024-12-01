package com.proj.bs.config;

import javax.servlet.ServletContext;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {

	@Override
	protected void beforeSpringSecurityFilterChain(ServletContext servletContext) {
		System.out.println("Before security filter chain");
	}

	@Override 
	protected void afterSpringSecurityFilterChain(ServletContext servletContext) { 
		System.out.println("After security filter chain"); 
		}
	}