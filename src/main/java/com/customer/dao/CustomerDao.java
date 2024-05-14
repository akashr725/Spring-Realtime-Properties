package com.customer.dao;

import com.customer.bo.CustomerBo;

public interface CustomerDao {
	
	public int registerCustomer(CustomerBo bo) throws Exception;

}
