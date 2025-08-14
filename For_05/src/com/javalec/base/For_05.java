package com.javalec.base;

import java.util.Scanner;

public class For_05 {

	public static void main(String[] args) {
		// 구구단 출력
		/*
		for(int i = 2; i < 10; i++) { 
			System.out.println("[ " + i + "단 ]"); 
			for(int j= 1; j < 10; j++) { 
				System.out.println(i + " X " + j + " = " + (i*j)); 
			}
			System.out.println("\n/*==================\n"); 
		}
		*/
		
		/**
		 * 사용자로부터 시작단과 끝단을 입력받아 출력하기
		 * - 출력 예) 
		 * 시작 단을 입력하세요. : 3
		 * 끝 단을 입력하세요. : 10
		 */
		
		/*
		Scanner sc = new Scanner(System.in);
		int startDan = 0;
		int endDan = 0;
		
		System.out.print("시작 단을 입력하세요. : ");
		startDan = sc.nextInt();

		System.out.print("끝 단을 입력하세요. : ");
		endDan = sc.nextInt();
		
		System.out.println("");
		
		
		for(int i = startDan; i <= endDan; i++) {
			System.out.println("[ " + i + "단 ]"); 
			for(int j= 1; j < 10; j++) { 
				if((i*j) % 2 == 0) System.out.println(i + " X " + j + " = " + (i*j)); 
			}
			System.out.println("\n/*==================\n"); 
		}
		*/
		
		for(int j = 1; j < 10; j++) {
			for(int i = 2; i < 10; i++) {
				System.out.print(i + " X " + j + " = " + (i*j) + "\t");
			}
			System.out.println("");
		}
		
	}

}
