package com.restservice.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restservice.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
