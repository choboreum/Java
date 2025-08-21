package com.javalec.function;

public class StoreShop1 extends StoreHQ {

	@Override
	public void orderKim() {// 해당 메소드는 삭제할 수 없다.
		System.out.println("KimChiJjiGae : 4,500won");
	}

	@Override
	public void orderBu() {
		System.out.println("BuDaeJjiGae : 5,000won");
	}

	@Override
	public void orderBi() {
		System.out.println("BiBimBap: -");
	}

	@Override
	public void orderSoon() {
		System.out.println("SoonGaeGook : 7,000won");
	}
}
