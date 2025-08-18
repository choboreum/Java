package com.javalec.function;

public class Calc {
	// Property
	public int num1;
	public int num2;
	
	// Constructor
	public Calc() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	public void addAction() {
		System.out.println("덧셈 : " + (num1 + num2));	
	}
	
	public void subAction() {
		System.out.println("뺄셈 : " + (num1 - num2));			
	}
	
	public void mulAction() {
		System.out.println("덧셈 : " + (num1 * num2));	
	}

	public void divAction() {
		System.out.println("나눗셈 : " + String.format("%.2f", ((double)num1 / num2)));	
	}
	
}
