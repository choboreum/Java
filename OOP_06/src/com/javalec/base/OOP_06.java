package com.javalec.base;

import com.javalec.function.Calc;

public class OOP_06 {
	public static void main(String[] args) {
		Calc calc = new Calc();
		
		calc.num1 = 12;
		calc.num2 = 10;
		
		calc.addAction();
		calc.subAction();
		calc.mulAction();
		calc.divAction();
	}
}
