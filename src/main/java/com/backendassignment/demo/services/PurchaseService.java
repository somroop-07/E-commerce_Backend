package com.backendassignment.demo.services;
import com.backendassignment.demo.entitites.*;


import java.util.List;
import java.util.Optional;

public interface PurchaseService {
   public List<Purchase> getPurchases();
   public Optional<Purchase> getPurchases(Long id);
   public Purchase addPurchases(Purchase purchase);
}
