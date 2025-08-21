package com.javalec.function;

public class DmbPhone extends Phone {
	// Property
	public int channel;
	
	// Constructor
	public DmbPhone() {
		
	}
	
	public DmbPhone(String model, String color, int channel) {
		super();
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	// Method
	public void turnOnDmb() {
		System.out.println("채널 : " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	public void changeChannelDmb(int channel) {
		System.out.println("채널 : " + channel + "번으로 바꿉니다.");
	}
	public void turnOffDmb() {
		System.out.println("DMB 방송 수신을 종료합니다.");
	}
}
