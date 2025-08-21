package com.javelec.function;

public class FirstSon {
	
	public FirstSon() {
		// TODO Auto-generated constructor stub
	}
	
	public void takeChoco() {
		// MamaBag mamaBag = new MamaBag();
		// MamaBag 에서 property를 static으로 제어(공유 데이터)하기 때문에 생성자를 만들 필요가 없다.
		MamaBag.choco -= 1;
		
		if(MamaBag.choco < 0) {
			System.out.println("첫째는 초코파이 먹고 싶어요~~~~~~~");
		} else {
			System.out.println("첫째는 초코파이를 맛있게 먹었습니다.");
		}
	}
}
