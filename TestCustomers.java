package com.java.spring.mvc.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spring.mvc.set.CarDealer;

@SuppressWarnings("unused")
public class TestCustomers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		//Load the setconfig xml file that will be implemented as dependency injection
		ApplicationContext context = new ClassPathXmlApplicationContext("com/java/spring/mvc/map/mapconfig.xml");
		Customer customer = (Customer)context.getBean("customer");
		System.out.println(customer);
		/*This below instruction confirms that Map interface by default is implemented by LinkedHashMap class
		 * Map would allow {key,value} pairs to be stored..
		 */
		System.out.println(customer.getProducts().getClass());
		
	}

}
