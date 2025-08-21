package com.javalec.function;

public class StoreShop1 extends StoreHQ {
	// Property
	
	// Constructor
	public StoreShop1 () {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	@Override // 부모로부터 상속받아 사용한 메소드임을 표현
	public void orderKim() {
		System.out.println("KimChiJjiGae : 4,500won");
	}
	
	@Override
	public void orderBu() {
		System.out.println("BuDaeJjiGae : 5,000won");
	}
	
	@Override
	public void orderSoon() {
		System.out.println("SoonDaeGook : -");
	}
}
