package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.SumEvenOdd;

public class OOP_02 {

	public static void main(String[] args) {
		// (객체지향인 것) 사용자가 입력하는 처음값과 끝값의 합계를 구하여 출력하고, 그 합의 짝/홀수를 판별
		Scanner sc = new Scanner(System.in);
		int startNum = 0;
		int endNum = 0;
		int sum = 0;
		
		//class명   객체명      = new 생성자명();
		SumEvenOdd sumEvenOdd = new SumEvenOdd();
		
		System.out.print("처음 값을 입력해주세요. : ");
		startNum = sc.nextInt();
		
		System.out.print("끝 값을 입력해주세요. : ");
		endNum = sc.nextInt();
		
		//변수 = 객체명.함수명(매개변수);
		sum = sumEvenOdd.sumCalc(startNum, endNum);
		
		System.out.print("사용자가 입력한 " + startNum + "부터 " + endNum + "의 합은 " + sum +"입니다. \n" + sum + "은 ");
		System.out.println(sumEvenOdd.evenOdd(sum));
	}

}
