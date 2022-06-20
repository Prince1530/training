package com.sbi;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {
	
	@Test
	public void test() {
		Car theCar =new Car();
		theCar.drive();
	}
	@Test
	
	public void testCarAgain() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("mySpring.xml");
		Car theCarObj= (Car) context.getBean("the Car");
		theCarObj.drive();
	}
}
