package com.javalec.function;

public class Sub extends Add {
	// Property
	// => num1, num2는 Add에서 상속
	int num3, num4;
	
	// Constructor
	public Sub(int num1, int num2) {
		// this.num1 = num1;
		// this.num2 = num2;
		super(num1, num2);
		this.num3 = num1 + 10;
		this.num4 = num2 + 5;
	}
	
	// Method
	public void subAction() {
		System.out.println(num3 - num4);
	}
}
