package com.customer.app;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.customer.controller.CustomerController;
import com.customer.vo.CustomerVo;

public class CustomerMain {
	
	public static void main(String[] args) {
		
		System.out.println("--------------Welcome to my app------------");
		
		String name,address,pAmnt,rate,time;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name: ");
		name=sc.next();
		System.out.println("Enter Address: ");
		address=sc.next();
		System.out.println("Enter pAmount: ");
		pAmnt=sc.next();
		System.out.println("Enter rate: ");
		rate=sc.next();
		System.out.println("Enter time: ");
		time=sc.next();
		
		CustomerVo vo=new CustomerVo();
		vo.setName(name);
		vo.setAddress(address);
		vo.setpAmnt(pAmnt);
		vo.setRate(rate);
		vo.setTime(time);
		
		//ioc container
		
//		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader xbdr=new XmlBeanDefinitionReader(factory);
//		
//		xbdr.loadBeanDefinitions("com/customer/cfg/applicationContext.xml");
		
		
	  ApplicationContext context=new ClassPathXmlApplicationContext("com/customer/cfg/applicationContext.xml");
		
		//get CustomerController bean obj
		
		CustomerController controller=context.getBean("custControl",CustomerController.class);
		try {
			
			   String  result=controller.doProcess(vo);
			   
			   System.out.println(result);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		
	}

}
