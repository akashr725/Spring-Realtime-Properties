package com.customer.bo;

// entity class

public class CustomerBo {
	
	private String name;
	private String address;
	private float pAmnt;
	private float interest;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getpAmnt() {
		return pAmnt;
	}
	public void setpAmnt(float pAmnt) {
		this.pAmnt = pAmnt;
	}
	public float getInterest() {
		return interest;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	}

}
