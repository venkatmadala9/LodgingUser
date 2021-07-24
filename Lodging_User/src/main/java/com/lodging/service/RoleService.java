package com.lodging.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodging.domain.Role;
import com.lodging.repo.RoleRepository;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepo;
	
	public List<Role> getRoles()
	{
		return roleRepo.findAll();
	}
	
	public Optional<Role> getRole(String id)
	{
		return roleRepo.findById(new Long(id));
	}
}
