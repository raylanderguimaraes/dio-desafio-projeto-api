package com.raylander.guimaraes.service;

import com.raylander.guimaraes.domain.model.User;

public interface UserService {
	User findById(Long id);
	
	User create(User userToCreate);
	
}
