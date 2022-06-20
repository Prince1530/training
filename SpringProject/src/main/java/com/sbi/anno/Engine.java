package com.sbi.anno;
public class Engine {
	Piston piston = new Piston();
	void ignite() {
		piston.firePiston();
		System.out.println("Ignited");
	}

}
