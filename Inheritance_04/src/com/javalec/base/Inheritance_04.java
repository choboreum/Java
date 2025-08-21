package com.javalec.base;

import com.javalec.function.StoreHQ;
import com.javalec.function.StoreShop1;
import com.javalec.function.StoreShop2;
import com.javalec.function.StoreShop3;

public class Inheritance_04 {

	public static void main(String[] args) {
		System.out.println("[HQ]------------");
		StoreHQ hq = new StoreHQ();
		hq.orderKim();
		hq.orderBu();
		hq.orderBi();
		hq.orderSoon();
		hq.orderkong();
		
		System.out.println("\n[StoreShop1]------------");
		StoreHQ shop1 = new StoreShop1();
		shop1.orderKim();
		shop1.orderBu();
		shop1.orderBi();
		shop1.orderSoon();
		shop1.orderkong();
		
		System.out.println("\n[StoreShop2]------------");
		StoreHQ shop2 = new StoreShop2();
		shop2.orderKim();
		shop2.orderBu();
		shop2.orderBi();
		shop2.orderSoon();
		shop2.orderkong();
		
		System.out.println("\n[StoreShop3]------------");
		StoreHQ shop3 = new StoreShop3();
		shop3.orderKim();
		shop3.orderBu();
		shop3.orderBi();
		shop3.orderSoon();
		shop3.orderkong();
		
	}

}
