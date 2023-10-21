package com.raylander.guimaraes.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raylander.guimaraes.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	boolean existsByAccountNumber(String accountNumber);
}
