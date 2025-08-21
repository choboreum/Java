package com.javelec.base;

import com.javelec.function.FirstSon;
import com.javelec.function.MamaBag;
import com.javelec.function.SecondSon;

public class Static_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstSon firstSon = new FirstSon();
		SecondSon secondSon = new SecondSon();
		
		firstSon.takeChoco();
		secondSon.takeChoco();
		
		System.out.println("----------------------\n");
		
		
		MamaBag mamaBagA = new MamaBag();
		MamaBag mamaBagB = new MamaBag();
		System.out.println(mamaBagA == mamaBagB);
	}

}
