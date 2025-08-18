package com.javalec.function;

public class Calc {
	public int addAction(int firstNum, int lastNum) {
		int result = firstNum + lastNum;
		
		return result;
	}
	public int subAction(int firstNum, int lastNum) {
		int result = firstNum - lastNum;
		
		return result;
	}
	public int mulAction(int firstNum, int lastNum) {
		int result = firstNum * lastNum;
		
		return result;
	}
	public double divAction(int firstNum, int lastNum) {
		double result = (double)firstNum / lastNum;
		
		return result;
	}
}
