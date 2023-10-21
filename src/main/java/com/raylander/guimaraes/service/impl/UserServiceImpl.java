package com.raylander.guimaraes.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.raylander.guimaraes.Application;
import com.raylander.guimaraes.domain.model.User;
import com.raylander.guimaraes.domain.repository.UserRepository;
import com.raylander.guimaraes.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User findById(Long id) {
		
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User userToCreate) {
		if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
			throw new IllegalArgumentException("This Account number already exists.");
		}
		return userRepository.save(userToCreate);
	}
	
	
	
}
