package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.CalcCons;
import com.javalec.function.CalcMethod;
import com.javalec.function.CalcProperty;
import com.javalec.function.CalcRange;
import com.javalec.function.CalcRange2;

public class OOP_08 {

	public static void main(String[] args) {
		// 사용자로부터 구구단의 단을 입력 받아 출력하기
		Scanner sc = new Scanner(System.in);
		
		int dan,    start,   end;
		//  단, 곱해지는 시작수, 곱해지는 마지막 수
		
		System.out.print("단을 입력하세요. : ");
		dan = sc.nextInt();
		
		/**
		 *  Case : Property를 통해 Sub Class 기능 수행
		 *  Class : CalcProperty
		 *  Method : gugu()
		 */
		CalcProperty calcp = new CalcProperty();
		calcp.dan = dan;
		calcp.gugu();

		/**
		 *  Case : Method를 통해 Sub Class 기능 수행
		 *  Class : CalcMethod
		 *  Method : gugu()
		 */
		CalcMethod calcm = new CalcMethod();
		calcm.gugu(dan);
		
		/**
		 *  Case : Constructor를 통해 Sub Class 기능 수행
		 *  Class : CalcCons
		 *  Method : gugu()
		 */
		CalcCons calcCons = new CalcCons(dan);
		calcCons.gugu();
		
		/**
		 *  Case : Constructor를 통해 Sub Class 기능 수행
		 *  Class : CalcRange
		 *  Method : gugu()
		 */
		System.out.println("");
		System.out.print("곱해지는 시작 숫자는? ");
		start = sc.nextInt();
		System.out.print("곱해지는 마지막 숫자는? ");
		end = sc.nextInt();
		
		CalcRange CalcRange = new CalcRange(dan, start, end);
		CalcRange.gugu();
		
		/**
		 *  Case : Constructor를 통해 Sub Class 기능 수행
		 *  Class : CalcRange2
		 */
		CalcRange2 CalcRange2 = new CalcRange2(dan, start, end);
	}

}
