package com.javalec.base;

import java.util.Scanner;

public class For_04 {

	public static void main(String[] args) {
		// 사용자가 단과 곱해지는 수(짝/홀/전체)를 선택하여 출력
		/**
		 * - 출력 예)
		 * 출력할 단을 입력하세요. : 2
		 * 곱해지는 수의 경우를 선택하세요.(1: 전체, 2: 짝수, 3: 홀수) : 2
		 * 
		 * 2 X 2 = 4;
		 * 2 X 4 = 8;
		 * 2 X 6 = 12;
		 * 2 X 8 = 16;
		 */
		
		Scanner sc = new Scanner(System.in);
		int dan = 0;
		int i = 0;
		
		System.out.print("출력할 단을 입력하세요. : ");
		dan = sc.nextInt();
		
		System.out.print("곱해지는 수의 경우를 선택하세요.(1: 전체, 2: 짝수, 3: 홀수) : ");
		i = sc.nextInt();
		
		switch(i) {
		case 1:
			System.out.println("\n[ " +  dan + "단 ]");
			for(i = 1; i < 10; i++) {
				System.out.println(dan + " X " + i + " = " + (dan*  i));
			}
			break;
		case 2:
			System.out.println("\n[ " +  dan +" X 짝수 ]");
			for(i = 2; i < 10; i+=2) {
				System.out.println(dan + " X " + i + " = " + (dan*  i));
			}
			break;
		case 3:
			System.out.println("\n[ " +  dan +" X 홀수 ]");
			for(i = 1; i < 10; i+=2) {
				System.out.println(dan + " X " + i + " = " + (dan*  i));
			}
			break;
		default:
			System.out.println("선택을 잘못 입력하셨습니다.");
			break;
		}
	}

}
