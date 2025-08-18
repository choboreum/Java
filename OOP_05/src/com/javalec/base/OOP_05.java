package com.javalec.base;

import com.javalec.function.Car;

public class OOP_05 {

	public static void main(String[] args) {
		// Instance 생성
		Car car = new Car();
		
		car.company = "기아자동차";
		car.model = "K7";
		car.color = "화이트";
		car.maxSpeed = 660;
		car.speed = 40;
		
		System.out.println("제작 회사 : " + car.company);
		System.out.println("모델명 : " + car.model);
		System.out.println("색상 : " + car.color);
		System.out.println("최고속도 : " + car.maxSpeed);
		System.out.println("현재속도 : " + car.speed);
		System.out.println("/=======================\n");
		
		// 다른 Instance 생성
		Car car1 = new Car();
		car1.speed = 230;

		System.out.println("제작 회사 : " + car1.company);
		System.out.println("모델명 : " + car1.model);
		System.out.println("색상 : " + car1.color);
		System.out.println("최고속도 : " + car1.maxSpeed);
		System.out.println("현재속도 : " + car1.speed);
		System.out.println("/=======================\n");
		
		// Instance 동일 비교
		Car car2 = new Car();
		Car car3 = new Car();
		System.out.println(car2 == car3);
	}

}
