package com.javalec.base;

public class Array_05 {

	public static void main(String[] args) {
		// Array
		String[] str = {"sun", "mon", "tue", "wed", "thr", "fri", "sat"};
		int[] intNum = {10, 20, 30};
		double[] doubleNum = {1.1, 1.2};
		boolean[] boolNum = {true, false, true, true};
		
		int tot = 0; //intNum의 합계 
		double doubleAvg = 0; //doubleNum의 평균
		int boolCount = 0; 
		
		//str에서 sun만 출력해보기
		System.out.println(str[0]);

		//str 전체 출력해보기
		for(int i = 0; i < str.length; i++) {			
			System.out.print(str[i]);
			if(!(i == str.length - 1)) {				
				System.out.print(", ");
			}
		}
		System.out.println("");
		
		//intNum의 합계(=tot) 구하기
		for(int i = 0; i < intNum.length; i++) {
			tot += intNum[i];
		}
		System.out.println("intNum의 합계는 " + tot);

		System.out.println("");
		
		//doubleNum의 평균(=doubleAvg) 구하기
		for(int i = 0; i < doubleNum.length; i++) {
			doubleAvg += doubleNum[i];
		}
		doubleAvg /= doubleNum.length;
		System.out.println("doubleNum의 평균은 " + doubleAvg);
		
		System.out.println("");
		
		//boolNum의 데이터 중 true의 개수 구하기
		for(int i = 0; i < boolNum.length; i++) {
			if(boolNum[i] == true) boolCount++;
		}
		System.out.println("boolNum의 true의 개수는 " + boolCount);
	}

}
