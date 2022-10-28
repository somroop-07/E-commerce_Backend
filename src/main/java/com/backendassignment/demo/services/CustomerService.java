package com.backendassignment.demo.services;
import com.backendassignment.demo.entitites.*;


import java.util.List;
import java.util.Optional;

public interface CustomerService {
   public List<Customer_Purchases> getCustomers();
   public Optional<Customers> getCustomers(Long id);
   public Customers addCustomers(Customers customer);
}
