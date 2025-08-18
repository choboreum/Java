package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.EvenOdd;

public class OOP_03 {

	public static void main(String[] args) {
		// 사용자가 입력한 숫자의 홀/짝 판별
		// 메인의 역할 => 사용자에게 숫자 받아오기
		// function의 역할 => 홀/짝 판별
		
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;
		EvenOdd evenodd = new EvenOdd(); //객체생성
		String result = "";
		
		// 사용자에게 숫자를 입력 받기
		System.out.print("숫자를 입력하세요. : ");
		inputNum = sc.nextInt();
		
		result = evenodd.evenodd1(inputNum);
		System.out.println("입력한 숫자 " + inputNum + "은(는) " + result + "입니다.");
		System.out.println("/*============================");
		
		evenodd.evenodd2(inputNum);
		System.out.println("/*============================");
		
		evenodd.evenodd3(inputNum);
	}

}
