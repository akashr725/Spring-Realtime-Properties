package com.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.customer.bo.CustomerBo;

public class CustomerDaoImpl implements CustomerDao {
	
	private DataSource ds;
	
	private Connection con;
	private static final String insertQuary="insert into customer values(cust_id,?,?,?,?)";
	
	public CustomerDaoImpl(DataSource ds) {
		this.ds=ds;
	}
	

	@Override
	public int registerCustomer(CustomerBo bo) throws Exception {
		
		con=ds.getConnection();
	    PreparedStatement ps=con.prepareCall(insertQuary);
	    
	    ps.setString(1, bo.getName());
	    ps.setString(2, bo.getAddress());
	    ps.setFloat(3, bo.getpAmnt());
	    ps.setFloat(4, bo.getInterest());
	    
	   int rowCount= ps.executeUpdate();
	   ps.close();
	   con.close();
		
		return rowCount;
	}

}
