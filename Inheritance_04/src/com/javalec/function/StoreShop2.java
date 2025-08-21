package com.javalec.function;

public class StoreShop2 extends StoreHQ {
	// Property
	
	// Constructor
	public StoreShop2 () {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	@Override // 부모로부터 상속받아 사용한 메소드임을 표현
	public void orderBu() {
		System.out.println("BuDaeJjiGae : 5,000won");
	}

	@Override
	public void orderBi() {
		System.out.println("BiBimBap : 4,000won");
	}
	
	@Override
	public void orderSoon() {
		System.out.println("SoonDaeGook : 4,000won");
	}
	
	@Override
	public void orderkong() {
		System.out.println("KongKiBap : Free");
	}
	
}
