package com.backendassignment.demo.dao;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backendassignment.demo.entitites.Purchase;
import com.backendassignment.demo.entitites.Shipping;

public interface PurchaseDao2 extends JpaRepository<Purchase,Long>{
	    List<Purchase> findBycid(long id);
	    
}

