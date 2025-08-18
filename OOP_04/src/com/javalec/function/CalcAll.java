package com.javalec.function;

public class CalcAll {
	public void calc(int firstNum, int lastNum) {
		Calc calc = new Calc(); 
		
		System.out.println("두 수의 덧셈 결과 : " + calc.addAction(firstNum, lastNum));
		System.out.println("두 수의 뺄셈 결과 : " + calc.subAction(firstNum, lastNum));
		System.out.println("두 수의 곱셈 결과 : " + calc.mulAction(firstNum, lastNum));
		System.out.println("두 수의 나눗셈 결과 : " + String.format("%.2f", calc.divAction(firstNum, lastNum)));

		System.out.println("/----------------------\n");
		
		System.out.println("두 수의 덧셈 결과 : " + (firstNum + lastNum));
		System.out.println("두 수의 뺄셈 결과 : " + (firstNum - lastNum));
		System.out.println("두 수의 곱셈 결과 : " + (firstNum * lastNum));
		System.out.println("두 수의 나눗셈 결과 : " + String.format("%.2f", ((double)firstNum / lastNum)));
	}
}
