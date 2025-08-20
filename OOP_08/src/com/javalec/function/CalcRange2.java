package com.javalec.function;

public class CalcRange2 {
	// Property
	int dan, start, end;
	
	// Constructor
	public CalcRange2(int dan, int start, int end) {
		this.dan = dan;
		this.start = start;
		this.end = end;
		
		gugu(); 
	}
	
	// Method
	private void gugu() {
		System.out.println("***** calcRange2 *****");
		for(int i = start; i <= end; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
}
