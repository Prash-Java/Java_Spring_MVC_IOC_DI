package com.java.spring.mvc.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/java/spring/mvc/list/listconfig.xml");
		Employee employee = (Employee)context.getBean("employee");
		System.out.println(employee.getName());
		System.out.println(employee.getProfiles());
		System.out.println(employee.getProfiles().getClass());

	}

}
