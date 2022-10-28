package com.backendassignment.demo.controller;

import java.util.List;



import java.util.Optional;

import com.backendassignment.demo.entitites.Customers;
import com.backendassignment.demo.entitites.Shipping;
import com.backendassignment.demo.entitites.Customer_Purchase_Ship;
//import com.backendassignment.demo.entitites.Customers;
import com.backendassignment.demo.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController 
public class ShippingController {
@Autowired
 private ShippingService service;	
	@GetMapping("/getAllshipping")
	public List<Customer_Purchase_Ship> getAllShipping()
	{
		return service.getShipping();
	}
	@GetMapping("/shipping/{city}")
	public List<Optional<Customers>> getAllCustomers(@PathVariable("city") String city)
	{
		return service.getShipping(city);
	}
	@PostMapping("/Addshipping")
	public Shipping AddShipping(@RequestBody Shipping shipping)
	{
		return this.service.addShipping(shipping);
	}
}
