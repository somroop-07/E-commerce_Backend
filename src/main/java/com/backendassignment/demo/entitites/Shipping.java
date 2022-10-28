package com.backendassignment.demo.entitites;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shipping {
	@Id
	private long id;
	private String address;
	private String city;
	private String pincode;
	private long pid;
	private long cid;
	public Shipping(long id, String address, String city, String pincode, long pid, long cid) {
		super();
		this.id = id;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.pid = pid;
		this.cid = cid;
	}
	public Shipping() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	
	
	
	
    
	
}
