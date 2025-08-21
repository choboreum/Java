package com.javalec.function;

public class Phone {
	// Property
	public String model, color;
	
	// Constructor
	public Phone() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	public void sendMessage(String message) {
		System.out.println("본인 : " + message);
	}
	public void receiveMessage(String message) {
		System.out.println("상대방 : " + message);
	}
}
