package com.java_8.hello;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Float");
		float f1=sc.nextFloat();
		System.out.println("Enter String");
		String s=sc.nextLine();
		System.out.println("Enter Float");
		float f2=sc.nextFloat();
		System.out.println("=====================");
		System.out.println("Float one is " + f1);
		System.out.println("String is " + s);
		System.out.println("Float 2 is " + f2);
	}

}
