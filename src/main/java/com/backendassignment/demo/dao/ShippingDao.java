package com.backendassignment.demo.dao;


import com.backendassignment.demo.entitites.*;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ShippingDao extends JpaRepository<Shipping,Long>{
	List<Shipping> findBycity(String city);
	List<Optional<Shipping>> findByPidAndCid(long pid,long cid);
}

