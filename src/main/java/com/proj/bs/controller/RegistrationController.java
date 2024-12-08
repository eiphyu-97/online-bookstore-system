package com.proj.bs.controller;

import java.util.HashSet;
import java.util.Set;

import com.proj.bs.model.Role;
import com.proj.bs.model.User;
import com.proj.bs.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

	@Autowired
	private PasswordEncoder encoder;

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/register")
	public String showRegistrationForm() {
		return "register";
	}

	@PostMapping("/register")
	public String registerUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		Role userRole = new Role();
		userRole.setName("ROLE_ADMIN");
		Set<Role> roles = new HashSet<>();
		roles.add(userRole);
		user.setRoles(roles);
		
		userRepository.save(user);
		return "redirect:/login";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	

}
