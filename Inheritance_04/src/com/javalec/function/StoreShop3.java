package com.javalec.function;

public class StoreShop3 extends StoreHQ {
	// Property
	
	// Constructor
	public StoreShop3 () {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	@Override // 부모로부터 상속받아 사용한 메소드임을 표현
	public void orderKim() {
		System.out.println("KimChiJjiGae : 6,000won");
	}
	
	@Override
	public void orderBu() {
		System.out.println("BuDaeJjiGae : 7,000won");
	}

	@Override
	public void orderSoon() {
		System.out.println("SoonDaeGook : 6,000won");
	}
	
	@Override
	public void orderkong() {
		System.out.println("KongKiBap : 2,000won");
	}
	
}
