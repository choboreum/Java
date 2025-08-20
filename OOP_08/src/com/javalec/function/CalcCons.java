package com.javalec.function;

public class CalcCons {
	// Property
	int dan;
	
	// Constructor
	public CalcCons(int dan) {
		this.dan = dan;
	}
	// Method
	public void gugu() {
		System.out.println("\n***** calcCons *****");
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
}
