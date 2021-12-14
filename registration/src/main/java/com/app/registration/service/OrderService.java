package com.app.registration.service;

import java.util.List;

import com.app.registration.model.Order;
import com.app.registration.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService{

    @Autowired
    OrderRepository orderRepo;

    public Order saveOrderDetails(Order order) {
        return orderRepo.save(order);
    }

    public List<Order> getOrderDetails() {
        return (List<Order>)orderRepo.findAll();
    }

    public Order getOrderById(long id) {
        return orderRepo.findById(id);
    }

    public void deleteallOrder() {
        orderRepo.deleteAll();;
    }

}