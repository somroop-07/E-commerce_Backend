package com.backendassignment.demo.entitites;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Customer_Purchase_Ship {
	@Id
	private long cid;
	private Purchase purchaseOrder;
	private List<Optional<Shipping>> shipmentDetail;
	public Customer_Purchase_Ship(long cid, Purchase purchaseOrder, List<Optional<Shipping>> shipmentDetail) {
		super();
		this.cid = cid;
		this.purchaseOrder = purchaseOrder;
		this.shipmentDetail = shipmentDetail;
	}
	public Customer_Purchase_Ship() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public Purchase getPurchaseOrder() {
		return purchaseOrder;
	}
	public void setPurchaseOrder(Purchase purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}
	public List<Optional<Shipping>> getShipmentDetail() {
		return shipmentDetail;
	}
	public void setShipmentDetail(List<Optional<Shipping>> shipmentDetail) {
		this.shipmentDetail = shipmentDetail;
	}
	
	
	
	
	
}
