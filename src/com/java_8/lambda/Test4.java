package com.java_8.lambda;


public class Test4 {
	
	interface FunInter1{
		int operation(int a, int b); 
	}

	interface FunInter2{
		void sayMessage(String message);
	}
	
	private int operate(int a, int b, FunInter1 fobj) {
		return fobj.operation(a, b);
	}

	public static void main(String[] args) {
		
		FunInter1 add = (int x, int y) -> (x+y);
		FunInter1 multiply = (m, n) -> (m * n);
		
		Test4 testObj = new Test4();
		System.out.println("Addition is " + testObj.operate(2, 3, add));
		System.out.println("Multiplication is " + testObj.operate(3, 2, multiply));
		
		FunInter2 message = message1 -> System.out.println("Hello " + message1);
		message.sayMessage("Irshad");
	}
}
