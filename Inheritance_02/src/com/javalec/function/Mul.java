package com.javalec.function;

public class Mul extends Sub {
	// Property
	
	// Constructor
	public Mul(int num1, int num2) {
		// this.num1 = num1;
		// this.num2 = num2;
		super(num1, num2); //Sub(에서는 Add에서 상속 받은)에서 상속받은 num1, num2
	}
	
	// Method
	public void mulAction() {
		System.out.println(num1 * num2);
	}
}
