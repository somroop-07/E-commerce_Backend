package com.backendassignment.demo.controller;

import java.util.List;




import java.util.Optional;

import com.backendassignment.demo.entitites.Customers;
import com.backendassignment.demo.entitites.Customer_Purchases;
import com.backendassignment.demo.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController 
public class CustomerController {
@Autowired
 private CustomerService service;

	@GetMapping("/home")
	public String home()
	{
		return "Welcome to E-Commerce Application";
	}
	
	@GetMapping("/getAllCustomers")
	public List<Customer_Purchases> getAllCustomers()
	{
		return service.getCustomers();
	}
	@GetMapping("/customers/{id}")
	@ResponseBody
	public Optional<Customers> getCustomer(@PathVariable("id") Long customerID)
	{
		return service.getCustomers(customerID);
	}
	
	@PostMapping("/Addcustomers")
	public Customers AddCustomer(@RequestBody Customers customer)
	{
		return this.service.addCustomers(customer);
	}
}
