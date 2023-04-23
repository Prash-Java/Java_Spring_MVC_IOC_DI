package com.java.spring.mvc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee)ctx.getBean("emp");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
	}

}
