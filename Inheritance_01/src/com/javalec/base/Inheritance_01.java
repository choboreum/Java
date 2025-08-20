package com.javalec.base;

import com.javalec.function.Child;
import com.javalec.function.Parents;

public class Inheritance_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------ parents ------");
		Parents parents = new Parents();
		parents.getFather();
		parents.getMother();
		
		System.out.println("\n------ child ------");
		
		Child child = new Child();
		child.getChild();
		child.getFather();
		child.getMother();
		System.out.println(child.str);
	}

}
