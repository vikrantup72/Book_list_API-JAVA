package com.app.registration.controller;

import com.app.registration.model.Order;
import com.app.registration.service.OrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class OrderController{

    @Autowired
    OrderService orderService;

    @PostMapping("/save/order")
    public Order saveOrderDetails(@RequestBody Order order){
        Order orderdetails = orderService. saveOrderDetails(order);
        return orderdetails;
    }

    @GetMapping("/get/order")
    public List<Order> getOrderDetails(){
        List<Order> orderDetails=  orderService.getOrderDetails();
       return orderDetails;
    }

    @GetMapping("/get/order/{id}")
    public Order getOrderById(@PathVariable int id){
        Order orderDetails  = orderService.getOrderById(id);
        return orderDetails;
    }
    @DeleteMapping("/deleteall/order")
    public void deleteallOrder(){
        orderService.deleteallOrder();
    }
}