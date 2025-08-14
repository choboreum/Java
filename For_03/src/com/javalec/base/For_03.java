package com.javalec.base;

import java.util.Scanner;

public class For_03 {

	public static void main(String[] args) {
		// 5단 구구단 출력하기
		int dan = 5;
		System.out.println("[ " + dan + "단 ]");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
		System.out.println("\n/---------------------------------- \n");

		// 사용자에게 입력받아 구구단 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 단을 입력하세요. : ");
		int inputDan = sc.nextInt();
		System.out.println("");

		System.out.println("[ " + inputDan + "단 ]");

//		for(int i = 1; i < 10; i++) { 
//			// System.out.println(inputDan + " X " + i +" = " + (inputDan*i) );
//		  
//		  
//			/*
//			 * if(i % 2 == 0) { System.out.println(inputDan + " X " + i + " = *"); } else {
//			 * System.out.println(inputDan + " X " + i + " = " + (inputDan*i) ); }
//			 */
//		  
//		  
//		    // System.out.println(inputDan + " X " + i + " = " + (i % 2 == 0 ? "*" : (inputDan*i)));
//		}

		if (inputDan % 2 == 0) {
			for (int i = 2; i < 10; i += 2) {
				System.out.println(inputDan + " X " + i + " = " + (inputDan * i));
			}
		}  else { 
			for(int i = 1; i < 10; i+=2) { 
				System.out.println(inputDan + " X " + i + " = " + (inputDan * i) ); 
			} 
		}

		// 구구단 출력
		/*
		 * for(int i = 3; i < 10; i++) { System.out.println("[ " + i + "단 ]"); for(int j
		 * = 1; j < 10; j++) { System.out.println(i + " X " + j + " = " + (i*j)); }
		 * System.out.println("\n/*==================\n"); }
		 */
	}

}
