package com.javalec.base;

import java.util.Scanner;

public class For_02 {

	public static void main(String[] args) {
		// 2단 구구단 출력
		int dan = 2;

		System.out.println("[ " + dan + "단 ]");
		for(int j = 1; j < 10; j++) {
			System.out.println(dan + " X " + j + " = " + (dan*j));
		}
		System.out.println("\n/*==================\n");
		
		// 사용자로부터 입력 받아 구구단 출력
		Scanner sc = new Scanner(System.in);
		
		int inputDan = 0;
		System.out.print("단을 입력하세요. : ");
		inputDan = sc.nextInt();
		
		System.out.println("");
		System.out.println("[ " + inputDan + "단 ]");
		for(int j = 1; j < 10; j++) {
			System.out.println(inputDan + " X " + j + " = " + (inputDan*j));
		}
		System.out.println("\n/*==================\n");
	}

}
