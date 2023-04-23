package com.java.spring.mvc.map;

import java.util.Map;

/*This is the Pojo Class and in real time, this class would always be associated with some database table,
 * The same classes when we implement with more refined SpringBoot frameworks, we would be actually implementing the same steps
 *  as in here, but using Annotations like @Entity, @Table, @Id, @Column, @Data, @NoArgsConstructor, @AllArgsConstructor 
 *  and in essence would not need to write boilerplate codes and instead let Annotations take care of all these in background..
 * TODO: Compare all these steps with Kotlin and observe how it implements these steps for backend, since Java and Kotlin are pretty
 * similar and Kotlin requires even lesser codes to acheive same requirements..
 */
public class Customer {
	/*Attributes that we would have in database table for this class, it is mapped with database table and columns,
	 * Now, the same with Springboot frameworks would be handled using Annotations like @Id, @Column etc
	 */
	
	/* Keeping fields as private is good practice and this in essence represents Encapsulation,
	 * Methods are public but can have other access modifiers as well, depending upon to what extent do we need to expose these methods,
	 * In our case, these below methods represents getters and setters,
	 * IMP: The below two attributes name and carModels would be undergoing the dependency injection(Inversion of control) via the
	 * setConfig.xml file which in turn would be used from the test class(SpringBoot achieves this by Annotations @Autowiring and 
	 * @Inject
	 * The difference here in this assignment is the ask for Map Interface, as the problem statement says one customer_id to be mapped
	 * with multiple product_id and thus multiple product_names(One to Many Mappings)..
	 * NOTE: All examples in these problem statements(List,Set,Map) are more precisely dealt with JPA,ORM using Hibernate..
	 */
	private int customerId;
	private Map<Integer,String> products;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Map<Integer, String> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", products=" + products + "]";
	}
	
}
