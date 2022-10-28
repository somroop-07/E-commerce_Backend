package com.backendassignment.demo.services;
import com.backendassignment.demo.entitites.*;


import java.util.List;
import java.util.Optional;

public interface ShippingService {
   public List<Customer_Purchase_Ship> getShipping();
   public List<Optional<Customers>> getShipping(String City);
   public Shipping addShipping(Shipping shipping);
}
