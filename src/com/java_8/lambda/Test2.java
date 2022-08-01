package com.java_8.lambda;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arList = new ArrayList<>();
		arList.add(1);
		arList.add(2);
		arList.add(9);
		arList.add(8);
		arList.add(4);
		arList.add(10);
		arList.add(52);
		arList.add(87);
		arList.add(45);
		
		arList.forEach(n -> System.out.print(n+ "  "));
		System.out.println("\n");
		arList.forEach(n-> {if(n%2==0) System.out.println(n);});
	}

}
