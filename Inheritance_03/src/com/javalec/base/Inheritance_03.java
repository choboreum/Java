package com.javalec.base;

import com.javalec.function.DmbPhone;

public class Inheritance_03 {

	public static void main(String[] args) {
		DmbPhone dmbPhone = new DmbPhone("자바폰", "검정", 11);
		
		// 상속 받은 Property 출력
		System.out.println(">> 부모 Property <<");
		System.out.println("모델 : " + dmbPhone.model);
		System.out.println("색상 : " + dmbPhone.color);
		System.out.println("-------------------------\n");
		
		// DmbPhone의 Property 출력
		System.out.println(">> 자식 Property <<");
		System.out.println("채널 : " + dmbPhone.channel);
		System.out.println("-------------------------\n");

		// 상속 받은 Method 호출
		System.out.println(">> 부모 Method <<");
		dmbPhone.powerOn();
		dmbPhone.bell();
		dmbPhone.sendMessage("여보세요, 홍길동입니다.");
		dmbPhone.receiveMessage("아! 안녕하세요.");
		dmbPhone.powerOff();
		System.out.println("-------------------------\n");

		// DmbPhone의 Method 호출
		System.out.println(">> 자식 Method <<");
		dmbPhone.turnOnDmb();
		dmbPhone.changeChannelDmb(24);
		dmbPhone.turnOffDmb();
		System.out.println("-------------------------\n");
		
	}

}
