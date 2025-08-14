package com.javalec.base;

public class Array_03 {

	public static void main(String[] args) {
		// 배열값으로 구구단 출력
		int[] dan = {5,3,9,7,8};
		int i = 0;
		int j = 0;
		
		for(i = 0; i < dan.length; i++) {
			System.out.println("[ " + dan[i] + "단 ]");
			for(j = 1; j < 10; j++) {
				System.out.println(dan[i] + " X " + j + " = "+ (dan[i]*j));
			}
			System.out.println("/*-----------------------------------------------\n");			
		}
		
		for(i = 1; i < 10; i++) {
			for(j = 0; j < dan.length; j++) {
				System.out.print(dan[j] + " X " + i + " = "+ (dan[j]*i) + "\t" );
			}
			System.out.println("");
		}
	}

}
