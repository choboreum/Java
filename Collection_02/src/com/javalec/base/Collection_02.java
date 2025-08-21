package com.javalec.base;

import java.util.HashMap;

public class Collection_02 {

	public static void main(String[] args) {
		/**
		 * Dictionary
		 * => Map 라고 부르며 Generic에 <K,V>로 구성 
		 * 							K : Key, V: Value
		 */
		
		HashMap<String, String> hashMap = new HashMap<>();
		// 추가
		hashMap.put("Apple", "사과");
		System.out.println(hashMap);

		System.out.println("");
		System.out.println("-- 추가 --");
		hashMap.put("Banana", "바나나");
		System.out.println(hashMap);
		System.out.println(hashMap.get("Apple")); //get에는 key만 전달한다, 해당 key에 맞는 value를 가져옴
		
		// 수정
		System.out.println("");
		System.out.println("-- 수정 --");
		hashMap.put("Apple", "사과 수정");
		System.out.println(hashMap);
		
		// 삭제
		System.out.println("");
		System.out.println("-- 삭제 --");
		hashMap.remove("Apple");
		System.out.println(hashMap);
		
		// 전체 삭제
		System.out.println("");
		System.out.println("-- 전체 삭제 --");
		hashMap.clear();
		System.out.println(hashMap);
	}

}
