package com.customer.service;

import com.customer.bo.CustomerBo;
import com.customer.dao.CustomerDao;
import com.customer.dto.CustomerDto;

public class CustomerService implements CustomerServiceInterface{
	
	private CustomerDao dao;
	
	public CustomerService(CustomerDao dao) {
		
		this.dao=dao;
	}

	@Override
	public String calSi(CustomerDto dto) throws Exception {
		
		//Caiculate si
		
		float si=0.0f;
		si=(dto.getpAmnt()* dto.getRate() * dto.getTime())/100.0f;
		
		CustomerBo bo=new CustomerBo();
		bo.setName(dto.getName());
		bo.setAddress(dto.getAddress());
		bo.setpAmnt(dto.getpAmnt());
		bo.setInterest(si);
		
		//call register method
		
	    int rowCount =dao.registerCustomer(bo);
	    if(rowCount>0) {
	    	return "Registration successful! Interest is: "+si;
	    }
	    else {
	    	return "Resigtration fail!";
	    }
		
	}

}
