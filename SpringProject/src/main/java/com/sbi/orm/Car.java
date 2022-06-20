package com.sbi.orm;
@Entity
@Table(name='cars')
public class Car implements Vehicle{
	@Id
	@Colulmn(name=("CARID")
	Engine engine= new Engine();
	public void drive() {
		engine.ignite();
		System.out.println("Driving a car");
	}
}

