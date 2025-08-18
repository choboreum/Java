package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Calc;
import com.javalec.function.CalcAll;
import com.javalec.function.CalcEach;

public class OOP_04 {

	public static void main(String[] args) {
		//숫자를 2개 입력 받아 덧셈, 뺄셈, 곱셈, 나눗셈 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		Calc calc = new Calc();
		CalcAll all = new CalcAll(); 
		CalcEach each = new CalcEach();
		
		int firstNum = 0;
		int lastNum = 0;
		
		System.out.print("첫번째 숫자를 입력하세요. : ");
		firstNum = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요. : ");
		lastNum = sc.nextInt();
		
		System.out.println("");
		System.out.println("두 수의 덧셈 결과 : " + calc.addAction(firstNum, lastNum));
		System.out.println("두 수의 뺄셈 결과 : " + calc.subAction(firstNum, lastNum));
		System.out.println("두 수의 곱셈 결과 : " + calc.mulAction(firstNum, lastNum));
		System.out.println("두 수의 나눗셈 결과 : " + String.format("%.2f", calc.divAction(firstNum, lastNum)));
		
		System.out.println("/----------------------\n");
		all.calc(firstNum, lastNum);
		
		System.out.println("/----------------------\n");
		each.add(firstNum, lastNum);
		System.out.println("/----------------------\n");
		each.calc(firstNum, lastNum);
		
		// ex
		// System.out.println(String.format("%5.2f", 1.21548));
	}

}
