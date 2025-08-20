package com.javalec.base;

import com.javalec.function.Add;
import com.javalec.function.Mul;
import com.javalec.function.Sub;

public class Inheritance_02 {

	public static void main(String[] args) {
		// 덧셈 계산
		Add add = new Add(10, 20);
		add.addAction();
		
		// 덧셈과 뺄셈 계산 : 덧셈 기능 상속 후 뺄셈 기능 추가
		System.out.println("=============");
		
		Sub sub = new Sub(10, 20);
		sub.addAction();
		sub.subAction();
		
		// 덧셈과 뺄셈과 곱셈 계산 : 덧셈 기능이 있는 뺄셈 기능 상속 후 곱셈 기능 추가
		System.out.println("=============");
		
		Mul mul = new Mul(10, 20);
		mul.addAction();
		mul.subAction();
		mul.mulAction();
	}

}
