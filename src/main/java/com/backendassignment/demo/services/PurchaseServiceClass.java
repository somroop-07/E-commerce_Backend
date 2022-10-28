package com.backendassignment.demo.services;
import com.backendassignment.demo.dao.*;
import com.backendassignment.demo.entitites.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PurchaseServiceClass implements PurchaseService {
	
	@Autowired
	private PurchaseDao purchaseDao;

	@Override
	public List<Purchase> getPurchases() {
		// TODO Auto-generated method stub
		
		return purchaseDao.findAll();
	}
	@Override
	public Optional<Purchase> getPurchases(Long id) {
		return purchaseDao.findById(id);
	}
	@Override
	public Purchase addPurchases(Purchase purchase) {
	    purchaseDao.save(purchase);
		return purchase;
	}

	
   
}
