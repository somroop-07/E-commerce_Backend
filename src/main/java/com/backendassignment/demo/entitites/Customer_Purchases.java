package com.backendassignment.demo.entitites;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Customer_Purchases {
	@Id
	private long cid;
	private List<Optional<Purchase>> purchaseOrder;
	public Customer_Purchases(long cid, List<Optional<Purchase>> purchaseOrder) {
		super();
		this.cid = cid;
		this.purchaseOrder = purchaseOrder;
	}
	public Customer_Purchases() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public List<Optional<Purchase>> getPurchaseOrder() {
		return purchaseOrder;
	}
	public void setPurchaseOrder(List<Optional<Purchase>> purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}
	
	
}
