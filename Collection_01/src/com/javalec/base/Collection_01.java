package com.javalec.base;

import java.util.ArrayList;

public class Collection_01 {

	public static void main(String[] args) {
		// ArrayList : 데이터의 삽입 삭제 수정이 가능하다.
		// ArrayList<type>
		//          <type> : Generic
		ArrayList<String> arrayList = new ArrayList<String>();
		
		// 데이터 삽입(create)
		System.out.println("Create");
		arrayList.add("Str1");
		System.out.println("Read");
		System.out.print(arrayList.size() + "개 존재 : ");
		System.out.println(arrayList);

		// 데이터 검색(read)
		arrayList.add("Str2");
		arrayList.add("Str3");
		arrayList.add("Str4");
		arrayList.add("Str5");
		arrayList.add("Str6");
		arrayList.add("Str7");
		arrayList.add("Str8");
		arrayList.add("Str9");
		System.out.print(arrayList.size() + "개 존재 : ");
		System.out.println(arrayList);
		System.out.println("");
		
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i)); //해당 인덱스의 데이터 가져오기
		}
		
		//데이터 수정(update)
		System.out.println("");
		System.out.println("Update");
		arrayList.set(0, "Str01"); //해당 인덱스를 수정
		System.out.println(arrayList);
		
		//데이터 삭제(delete)
		System.out.println("");
		System.out.println("Delete");
		arrayList.remove(8); //해당 인덱스 번호 삭제
		System.out.println(arrayList);
		arrayList.remove("Str3"); //해당 문자열 삭제
		System.out.println(arrayList);

		//데이터 삽입(create)
		System.out.println("");
		System.out.println("Create");
		arrayList.add(0, "A");
		System.out.println(arrayList);
		
		//데이터 전체 삭제
		System.out.println("");
		System.out.println("clear");
		arrayList.clear();
		System.out.println(arrayList);
	}

}
