package com.app.registration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="pro_order")
public class Order{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Order_name")
	private String name;


	@Column(name = "order_price")
    private String price;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPrice() {
        return price;
    }


    public void setPrice(String price) {
        this.price = price;
    }


    public Order(Long id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public Order() {
        super();
    }


    @Override
    public String toString() {
        return "Order [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

    
}