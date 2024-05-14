package com.customer.dto;

import java.io.Serializable;

public class CustomerDto implements Serializable {
	
	private String name;
	private String address;
	private float pAmnt;
	private float rate;
	private float time;
	
	public float getpAmnt() {
		return pAmnt;
	}
	public void setpAmnt(float pAmnt) {
		this.pAmnt = pAmnt;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
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



}
