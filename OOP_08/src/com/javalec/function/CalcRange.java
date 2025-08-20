package com.javalec.function;

public class CalcRange {
	// Property
	int dan, start, end;
	
	// Constructor
	public CalcRange(int dan, int start, int end) {
		this.dan = dan;
		this.start = start;
		this.end = end;
	}
	
	// Method
	public void gugu() {
		System.out.println("***** calcRange *****");
		for(int i = start; i <= end; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
}
