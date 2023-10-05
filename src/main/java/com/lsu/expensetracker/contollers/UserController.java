package com.lsu.expensetracker.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.lsu.expensetracker.models.User;
import com.lsu.expensetracker.services.UserService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/login")
	public User login(@RequestBody User user) {
		User authenticatedUser = service.login(user);
		if (authenticatedUser != null) {
			return authenticatedUser;
		}
		throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Login failed.");
	}

	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable Long id) {
		return service.getUserById(id).orElse(null);
	}

	@PostMapping("/users")
	public User saveUser(@RequestBody User user, HttpServletResponse response) {
		try {
			return service.saveUser(user);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}

	@PutMapping("/users/{id}")
	public User updateUser(@PathVariable Long id, @RequestBody User user) {
		if (service.getUserById(id).isPresent()) {
			return service.saveUser(user);
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found.");
	}

}
