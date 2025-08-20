package com.javalec.function;

public class Add {
	// Property
	int num1, num2;
	
	// Constructor : overload
	public Add() {
		// TODO Auto-generated constructor stub
	}
	
	public Add(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// Method
	public void addAction() {
		System.out.println(num1 + num2);
	}
}
