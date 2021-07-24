package com.lodging.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodging.domain.User;
import com.lodging.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public void saveUser(User user)
	{
		userRepo.save(user);
	}
	
	public Optional<User> getUser(String id)
	{
		return userRepo.findById(new Long(id));
	}
	
	public List<User> getUsers()
	{
		return userRepo.findAll();
	}
}
