package com.customer.controller;

import com.customer.dto.CustomerDto;
import com.customer.service.CustomerService;
import com.customer.vo.CustomerVo;

public class CustomerController {
	private CustomerService service;
	
	public CustomerController(CustomerService service) {
		this.service=service;
	}
	
	public String doProcess(CustomerVo vo) throws Exception {
		
		String name=vo.getName();
		String address=vo.getAddress();
		float pAmnt=Float.parseFloat(vo.getpAmnt());
		float rate=Float.parseFloat(vo.getRate());
		float time=Float.parseFloat(vo.getTime());
		
		CustomerDto dto=new CustomerDto();
		dto.setName(name);
		dto.setAddress(address);
		dto.setpAmnt(pAmnt);
		dto.setRate(rate);
		dto.setTime(time);
		
	    String status=service.calSi(dto);
	    
	    return status;
		
		
	}

}
