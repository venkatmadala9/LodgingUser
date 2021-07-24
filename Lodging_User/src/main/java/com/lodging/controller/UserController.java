package com.lodging.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lodging.domain.User;
import com.lodging.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/{id}")
	public Optional<User> getUser(@RequestParam("id") String id)
	{
		return userService.getUser(id);
	}
	
	@GetMapping("/")
	public List<User> getusers()
	{
		return userService.getUsers();
	}
}
