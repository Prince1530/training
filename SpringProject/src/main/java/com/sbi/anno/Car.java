package com.sbi.anno;
public class Car implements Vehicle{
	Engine engine= new Engine();
	public void drive() {
		engine.ignite();
		System.out.println("Driving a car");
	}
}

