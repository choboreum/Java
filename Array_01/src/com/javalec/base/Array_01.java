package com.javalec.base;

public class Array_01 {

	public static void main(String[] args) {
		// 배열(Array)
		String[] str = {"sun", "mon", "tue", "wed", "thr", "fri", "sat"};
		
		//System.out.println(str[0]);
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		System.out.println("");
		//============================================
		String[] str2 = new String[3];
		
		str2[0] = "Apple";
		str2[1] = "Banana";
		str2[2] = "Peach";
		
		for(int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
		
		String apple = str2[0];  
		System.out.println(apple);
	}

}
