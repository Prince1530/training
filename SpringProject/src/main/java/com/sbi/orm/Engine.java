package com.sbi.orm;
public class Engine {
	Piston piston = new Piston();
	void ignite() {
		piston.firePiston();
		System.out.println("Ignited");
	}

}
