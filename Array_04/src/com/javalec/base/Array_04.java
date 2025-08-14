package com.javalec.base;

import java.util.Scanner;

public class Array_04 {

	public static void main(String[] args) {
		// 사용자가 입력하느 숫자 5개를 받아서 합계 구하기
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int tot = 0;
		
		// 5개의 숫자 입력 받기
		for(int i = 0; i < num.length; i++) {
			System.out.print((i+1) + "번의 숫자를 입력해주세요. : ");
			num[i] = sc.nextInt();
			
			tot += num[i];
		}
		
		System.out.println("");
		System.out.print("입력하신 수는 ");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			if(!(i == num.length - 1)) {				
				System.out.print(",");
			}
		}
		System.out.println(" 입니다. \n");
		
		System.out.println("5개의 숫자의 합은 " + tot + "입니다.");
	}

}
