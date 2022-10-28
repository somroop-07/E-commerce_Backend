package com.backendassignment.demo.entitites;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customers {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String cname;
	private String cemail;
	private String cmobile;
	private String ccity;
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customers(long id, String cname, String cemail, String cmobile, String ccity) {
		super();
		this.id = id;
		this.cname = cname;
		this.cemail = cemail;
		this.cmobile = cmobile;
		this.ccity = ccity;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	@Override
	public String toString() {
		return "Customers [id=" + id + ", cname=" + cname + ", cemail=" + cemail + ", cmobile=" + cmobile + ", ccity="
				+ ccity + "]";
	}
	public String getCmobile() {
		return cmobile;
	}
	public void setCmobile(String cmobile) {
		this.cmobile = cmobile;
	}
	public String getCcity() {
		return ccity;
	}
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}
	
	
	
    
	
}
