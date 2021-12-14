package com.app.registration.repository;

import com.app.registration.model.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
    public Order findById(long id);
}