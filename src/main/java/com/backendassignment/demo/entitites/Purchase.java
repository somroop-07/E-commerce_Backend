package com.backendassignment.demo.entitites;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Purchase {
	@Id
	private long id;
	private String name;
	private String quantity;
	private String pricing;
	private String mrp;
	private long cid;
	
	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Purchase(long id, String name, String quantity, String pricing, String mrp, long cid) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.pricing = pricing;
		this.mrp = mrp;
		this.cid = cid;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPricing() {
		return pricing;
	}
	public void setPricing(String pricing) {
		this.pricing = pricing;
	}
	public String getMrp() {
		return mrp;
	}
	public void setMrp(String mrp) {
		this.mrp = mrp;
	}
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	
	
	
}
