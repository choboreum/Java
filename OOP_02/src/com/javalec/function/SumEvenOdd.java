package com.javalec.function;

public class SumEvenOdd {
	//Field or Attribute, Property (전역변수)
	
	//Constructor (생성자)
	
	//Method or Function (기능)
		//접근제어자 반환타입 메소드명(매개변수)
		public    int    sumCalc(int startNum, int endNum) {
			int sum = 0;
			for(int i = startNum; i <= endNum; i++) {
				sum += i;
			}
			
			return sum;
		}

		//접근제어자 반환타입 메소드명(매개변수)
		public String evenOdd(int sum) {
			String result = "";
			
			if(sum % 2 == 0) result = "짝수입니다.";
			else result = "홀수입니다.";
			
			return result;
		}
}
