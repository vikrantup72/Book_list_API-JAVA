package com.app.registration.repository;

import com.app.registration.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{

    public Product findById(long id);
    
}
