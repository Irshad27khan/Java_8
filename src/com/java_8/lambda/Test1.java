package com.java_8.lambda;

interface FunInterface{
	
	void abstractFun(int a);
	
	default void normalFun() {
		System.out.println("default function");
	}
}
public class Test1 {
	public static void main(String[] args) {
		FunInterface fObj = (int b) -> System.out.println(2*b);
		fObj.abstractFun(15);
		fObj.normalFun();
	}

}
