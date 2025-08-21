package com.javalec.base;

import com.javalec.function.StoreHQ;
import com.javalec.function.StoreShop1;
import com.javalec.function.StoreShop2;

public class Abstract_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[StoreShop1]------------");
		StoreHQ store1 = new StoreShop1();
		store1.orderKim();
		store1.orderBu();
		store1.orderBi();

		System.out.println("\n[StoreShop2]------------");
		StoreHQ store2 = new StoreShop2();
		store2.orderKim();
		store2.orderBu();
		store2.orderBi();
	}

}
