package com.app.registration.service;

import java.util.List;


import com.app.registration.model.Product;

import com.app.registration.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService{
    
    @Autowired
    ProductRepository repo;

    public Product saveProductDetails(Product product) {
        return repo.save(product);
    }

    public List<Product> getAllProductdetails() {
        return (List<Product>)repo.findAll();
    }

    public Product getProductsById(long id) {
        return repo.findById(id);
    }


    public Product updateProductDetails(Product product) {
        return repo.save(product);
    }

    public void deleteProductDetails(long id) {
        repo.deleteById(id);
    }





}