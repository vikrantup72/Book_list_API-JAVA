package com.app.registration.controller;

import java.util.List;


import com.app.registration.model.Product;

import com.app.registration.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ProductController{

    @Autowired
    ProductService productService;

    @PostMapping("/save/products")
    public Product saveProductDetails(@RequestBody Product product){
        Product productDetails = productService. saveProductDetails(product);
        return productDetails;
    }
   
    @GetMapping("/get/products")
    public List<Product> getAllProductdetails(){
       List<Product> productDetails=  productService.getAllProductdetails();
       return productDetails;
    }

    @GetMapping("/get/products/{id}")
    public Product getProductsById(@PathVariable long id){
        Product productDetails  = productService.getProductsById(id);
        return productDetails;
    }


    @PutMapping("/update/products")
    public Product updateProductDetails(@RequestBody Product product){
        Product productDetails  = productService.updateProductDetails(product);
        return productDetails;
    }

    @DeleteMapping("/delete/products/{id}")
    public void deleteProductDetails(@PathVariable long id ){
        productService.deleteProductDetails(id);
    }
    
}
