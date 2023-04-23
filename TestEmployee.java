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
		//This below instruction confirms that List interface by default is implemented by ArrayList
		System.out.println(employee.getProfiles().getClass());

	}

}
