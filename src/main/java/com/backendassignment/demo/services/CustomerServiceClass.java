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
public class CustomerServiceClass implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	@Autowired
	private PurchaseDao purchaseDao;

	@Override
	public List<Customer_Purchases> getCustomers() {
		// TODO Auto-generated method stub
		List<Customers> list=customerDao.findAll();
		List<Customer_Purchases> list_new=new ArrayList<>();
		for(Customers item:list)
		{
			long id=item.getId();
			List<Optional<Purchase>> purchase=purchaseDao.findBycid(id);
			
			list_new.add(new Customer_Purchases(id,purchase));
		}
	
		return list_new;
		
	}
	@Override
	public Optional<Customers> getCustomers(Long id) {
		return customerDao.findById(id);
	}
	@Override
	public Customers addCustomers(Customers customer) {
	    customerDao.save(customer);
		return customer;
	}

	
   
}
