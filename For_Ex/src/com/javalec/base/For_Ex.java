package com.javalec.base;

public class For_Ex {

	public static void main(String[] args) {
		int tot = 0; 
		// 1부터 100까지 합계 구하기
		// for(int i = 1; i <= 100; i++) { tot += i; }
		// System.out.println("1부터 100까지의 총 합은 " + tot + "이다");
		 

		// 1부터 100까지의 홀수 합계 구하기
		// for (int i = 1; i <= 100; i += 2) { tot += i; }
		// System.out.println("1부터 100까지의 홀수 총 합은 " + tot + "이다");
		
		// 1부터 100까지의 짝수 합계 구하기
		/*
		 * for (int i = 1; i <= 100; i++) { if(i % 2 == 0) { tot += i; } }
		 * System.out.println("1부터 100까지의 짝수 총 합은 " + tot + "이다");
		 */
		
		// 1부터 100까지의 수 중 짝수의 합과 홀수의 합을 각각 구하기
		// 단, for는 한개만 사용하기
		int odd_tot = 0;
		int even_tot = 0;
		
		for(int i = 0; i <= 100; i++) {
			tot += i;
			
			if(i % 2 == 0) {
				even_tot += i;
			} else {
				odd_tot += i;
			}
		}
		
		System.out.println("1부터 100까지의 총 합은 " + tot + "이다");
		System.out.println("1부터 100까지의 홀수 총 합은 " + odd_tot + "이다");
		System.out.println("1부터 100까지의 홀수 총 합은 " + even_tot + "이다");
	}

}
