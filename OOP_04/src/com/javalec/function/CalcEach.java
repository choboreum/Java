package com.javalec.function;

public class CalcEach {
	// Property
	
	// Constructor
	public CalcEach() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	public void add(int firstNum, int lastNum) {
		System.out.println("뎃셈 : " + (firstNum + lastNum));
	}
	public void sub(int firstNum, int lastNum) {
		System.out.println("뺄셈 : " + (firstNum - lastNum));
	}
	public void mul(int firstNum, int lastNum) {
		System.out.println("곱셈 : " + (firstNum * lastNum));
	}
	public void div(int firstNum, int lastNum) {
		System.out.println("나눗셈 : " +  String.format("%.2f", ((double)firstNum / lastNum)));
	}
	
	public void calc(int firstNum, int lastNum) {
		add(firstNum, lastNum);
		sub(firstNum, lastNum);
		mul(firstNum, lastNum);
		div(firstNum, lastNum);
	}
}
