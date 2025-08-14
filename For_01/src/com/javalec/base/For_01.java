package com.javalec.base;

import java.util.Scanner;

public class For_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tot = 0;
		int i = 0;
		for(i = 1; i <= 100; i++) {
			//System.out.println(i);
			tot += i;
		}
		System.out.println(i);
		System.out.println("1부터 100까지 총 합은 : "+ tot);
		System.out.println("\n/---------------------------------\n");
		
		
		
		/**
		 * 사용자의 입력 숫자들로 범위 숫자의 합을 구하는 코드
		 * - 출력 예)
		 * 첫번째 숫자는? 1
		 * 마지막 숫자는? 10
		 * 1에서 10까지의 합은 55 입니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num1_1 = 0; //초기 시작 숫자
		int num2_1 = 0; //초기 끝 숫자
		int sum = 0;
		int oddSum = 0; //홀수 합계
		int evenSum = 0; //짝수 합계
		int oddCount = 0; //홀수 개수
		int evenCount = 0; //짝수 개수
		double avg = 0.0;
		double oddAvg = 0.0;
		double evenAvg = 0.0;
		
		System.out.print("첫번째 숫자는? ");
		num1_1 = sc.nextInt();
		System.out.print("마지막 숫자는? ");
		num2_1 = sc.nextInt();
		System.out.println("");
		
		if(num1_1 > num2_1) { //마지막수와 첫번째수 대소 비교 후 큰수와 작은수의 위치를 잡아주는 if문
			num1 = num2_1;
			num2 = num1_1;
		} else {
			num1 = num1_1;
			num2 = num2_1;
		}
		
		for(int j = num1; j <= num2; j++) {
			sum += j; //합계
			if(j % 2 == 0) { //짝수
				evenSum += j; //짝수 합계
				evenCount++; //짝수 개수
			} else { //홀수
				oddSum += j; //홀수 합계
				oddCount++; //홀수 개수
			}
		}
		avg = (double)sum / (num2 - num1 + 1); //합계 평규
											//숫자의 개수를 구하기 위해 (마지막 숫자 - 처음 숫자 + 1)를 계산해준다 
											//sum, num1, num2 모두 int형이기 때문에 형 변환을 위해 명시적으로 double를 작성해준다.
		oddAvg = (double)oddSum / oddCount; //홀수합계 평균
		evenAvg = (double)evenSum / evenCount; //짝수합계 평균
		
		System.out.println(num1 + "에서 " + num2 + "까지의 합은 " + sum + "입니다. 합계의 평균은 " + avg + "입니다.\n");	
		System.out.println("홀수의 개수는 " + oddCount + "이며, 홀수 합은 " + oddSum + "입니다. 홀수 합계의 평균은 " + oddAvg + "입니다.");		
		System.out.println("짝수의 개수는 " + evenCount + "이며, 짝수 합은 " + evenSum + "입니다. 짝수 합계의 평균은 " + evenAvg + "입니다.");		
	}

}
