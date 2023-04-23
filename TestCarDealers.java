package com.java.spring.mvc.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spring.mvc.set.CarDealer;

@SuppressWarnings("unused")
public class TestCarDealers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		//Load the setconfig xml file that will be implemented as dependency injection
		ApplicationContext context = new ClassPathXmlApplicationContext("com/java/spring/mvc/set/setconfig.xml");
		CarDealer carDealer = (CarDealer)context.getBean("cardealer");
		System.out.println(carDealer.getName());
		System.out.println(carDealer.getCarModels());
		/*This below instruction confirms that Set interface by default is implemented by LinkedHashSet class
		 * Set would not allow duplicates to be stored
		 */
		System.out.println(carDealer.getCarModels().getClass().getName());
	}

}
