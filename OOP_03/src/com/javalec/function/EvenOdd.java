package com.javalec.function;

public class EvenOdd {
	// Property
	
	// Constructor
	
	// Method
	public String evenodd1(int num1) {
		String result = "";
		
		if(num1 % 2 == 0) result = "짝수";
		else result = "홀수";
			
		return result;
	}
	
	public void evenodd2(int num1) {
		if(num1 % 2 == 0) System.out.println("입력한 숫자 " + num1 + "은(는) 짝수입니다.");
		else System.out.println("입력한 숫자 " + num1 + "은(는) 홀수입니다.");
	}
	
	public void evenodd3(int num1) {
		String result = evenodd1(num1);
		System.out.println("입력한 숫자 " + num1 + "은(는) " + result + "입니다.");
	}
}
