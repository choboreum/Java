package com.javalec.function;

public class Calc {
	// Property
	int num1, num2;
	
	// Constructor
	public Calc(int num1, int num2) { //위 property와 다른 매개변수임!
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// Method
	public void add() {
		System.out.println("덧셈 : " + (num1 + num2));
	}
}
