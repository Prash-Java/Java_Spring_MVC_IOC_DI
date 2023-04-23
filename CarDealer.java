package com.java.spring.mvc.set;

import java.util.Set;

/*This is the Pojo Class and in real time, this class would always be associated with some database table,
 * The same classes when we implement with more refined SpringBoot frameworks, we would be actually implementing the same steps
 *  as in here, but using Annotations like @Entity, @Table, @Id, @Column, @Data, @NoArgsConstructor, @AllArgsConstructor 
 *  and in essence would not need to write boilerplate codes and instead let Annotations take care of all these in background..
 * TODO: Compare all these steps with Kotlin and observe how it implements these steps for backend, since Java and Kotlin are pretty
 * similar and Kotlin requires even lesser codes to acheive same requirements..
 */
public class CarDealer {
	/*Attributes that we would have in database table for this class, it is mapped with database table and columns,
	 * Now, the same with Springboot frameworks would be handled using Annotations like @Id, @Column etc
	 */
	
	/* Keeping fields as private is good practice and this in essence represents Encapsulation,
	 * Methods are public but can have other access modifiers as well, depending upon to what extent do we need to expose these methods,
	 * In our case, these below methods represents getters and setters,
	 * IMP: The below two attributes name and carModels would be undergoing the dependency injection(Inversion of control) via the
	 * setConfig.xml file which in turn would be used from the test class(SpringBoot achieves this by Annotations @Autowiring and 
	 * @Inject
	 * The difference here in this assignment is the ask for Set Interface instead of List Interface which was part of just previous 
	 * assignment problem statement
	 */
	private String name;
	private Set<String> carModels;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getCarModels() {
		return carModels;
	}
	public void setCarModels(Set<String> carModels) {
		this.carModels = carModels;
	}
}
