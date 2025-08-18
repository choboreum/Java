package com.javalec.base;

import java.util.Scanner;

public class OOP_01 {

	public static void main(String[] args) {
		// (객체지향이 아닌것) 사용자가 입력하는 처음값과 끝값의 합계를 구하여 출력하고, 그 합의 짝/홀수를 판별
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int startNum = 0;
		int endNum = 0;
		
		System.out.print("처음 값을 입력해주세요. : ");
		startNum = sc.nextInt();
		
		System.out.print("끝 값을 입력해주세요. : ");
		endNum = sc.nextInt();
		
		for(int i = startNum; i <= endNum; i++) {
			sum += i;
		}
		
		System.out.print("사용자가 입력한 " + startNum + "부터 " + endNum + "의 합은" + sum +"입니다. \n" + sum + "은 ");
		
		if(sum % 2 == 0) System.out.println("짝수입니다.");
		else System.out.println("홀수입니다.");
	}

}
