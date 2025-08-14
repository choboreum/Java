package com.javalec.base;

public class While_01 {

	public static void main(String[] args) {
		// 1부터 100의 합계 구하기 : for
		int total = 0;
		for(int i = 1; i <= 100; i++) {
			total += i;
		}
		System.out.println("for문 : " + total);
		//================================================================
		// 1부터 100의 합계 구하기 : while
		total = 0;
		
		int i = 1;
		while(i <= 100) {
			total += i;
			i++;
		}
		System.out.println("while문 : " + total);
		
		total = 0;
		i = 1;
		while(true) {
			total+=i;
			i++;
			if(i > 100) break;
		}
		System.out.println("while문2 : " + total);
	}

}
