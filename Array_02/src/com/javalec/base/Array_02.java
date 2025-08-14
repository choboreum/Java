package com.javalec.base;

public class Array_02 {

	public static void main(String[] args) {
		// 정수 배열(Array)
		int[] intNum = {1,4,7,12,234,1003,2004};
		
		//intNum 합계
		int tot = 0;
		for(int i = 0; i < intNum.length; i++) {
			tot += intNum[i];
		}
		System.out.println(tot);
		System.out.println("");
		
		//intNum 합계
		double avg = 0.0;
		avg = (double)tot / intNum.length;
		System.out.println(avg);
		System.out.println("");
		
		//intNum 중 짝수인 데이터의 평균 구하기
		int even_tot = 0;
		int evenCount = 0;
		double even_avg = 0.0;
		
		for(int i = 0; i < intNum.length; i++) {
			if(intNum[i] % 2 == 0) {
				even_tot += intNum[i];
				evenCount++;
			}
		}
		even_avg = (double)even_tot / evenCount;
		System.out.println(even_avg);
	}

}
