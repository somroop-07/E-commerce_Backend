package com.backendassignment.demo.controller;

import java.util.List;


import java.util.Optional;

import com.backendassignment.demo.entitites.Purchase;
import com.backendassignment.demo.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController 
public class PurchaseController {
@Autowired
 private PurchaseService service;

	@GetMapping("/getAllpurchases")
	public List<Purchase> getAllPurchases()
	{
		return service.getPurchases();
	}
	
	@GetMapping("/purchases/{id}")
	@ResponseBody
	public Optional<Purchase> getCustomer(@PathVariable("id") Long purchaseID)
	{
		return service.getPurchases(purchaseID);
	}
	
	@PostMapping("/Addpurchases")
	public Purchase AddPurchase(@RequestBody Purchase purchase)
	{
		return this.service.addPurchases(purchase);
	}
}
