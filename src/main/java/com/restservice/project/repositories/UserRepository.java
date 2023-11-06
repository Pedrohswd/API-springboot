package com.restservice.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restservice.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
