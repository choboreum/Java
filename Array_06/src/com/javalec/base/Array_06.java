package com.javalec.base;

import java.util.Scanner;

public class Array_06 {

	public static void main(String[] args) {
		/**
		 * -출력 예)
		 * James의 신장을 입력하세요. : _____
		 * Cathy의 신장을 입력하세요. : _____
		 * Kenny의 신장을 입력하세요. : _____
		 * Martin의 신장을 입력하세요. : _____
		 * Crystal의 신장을 입력하세요. : _____
		 * 
		 * 평균 신장은 : ____
		 * 가장 큰 학생은 ____ 이고, 그 학생의 키는 ____입니다.
		 * 가장 작은 학생은 ____ 이고, 그 학생의 키는 ____입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		String[] student = {"James", "Cathy", "Kenny", "Martin", "Crystal"};
		double[] cm = new double[student.length]; 
		double cmAvg = 0.0;
		
		double maxCm = 0.0; //제일 큰 키
		double minCm = 0.0; //제일 작은 키
		String maxStudent = ""; //제일 큰 키의 학생
		String minStudent = ""; //제일 작은 키의 학생

		for(int i = 0; i < student.length; i++) {
			System.out.print(student[i] + "의 신장을 입력하세요. : ");
			cm[i] = sc.nextDouble();
			cmAvg += cm[i];
			
			
		}
		cmAvg /= cm.length;

		//cm의 초기화
		maxCm = cm[0];
		minCm = cm[0];
		
		for(int i = 0; i < cm.length; i++) {
			if(maxCm <= cm[i]) {
				maxCm = cm[i];
				maxStudent = student[i];
			}
			
			if(minCm >= cm[i]) {
				minCm = cm[i];
				minStudent = student[i];
			}
		}
		
		System.out.println("");
		System.out.println("평균 신장은 : " + cmAvg);
		System.out.println("가장 큰 학생은 " + maxStudent + " 이고, 그 학생의 키는 " + maxCm + " 입니다.");
		System.out.println("가장 작은 학생은 " + minStudent + " 이고, 그 학생의 키는 " + minCm + " 입니다.");
	}

}
