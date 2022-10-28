package com.backendassignment.demo.dao;


import com.backendassignment.demo.entitites.Customers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerDao extends JpaRepository<Customers,Long>{
}

