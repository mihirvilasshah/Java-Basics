package com.learn.java.polymorphism;

public class Add {
	public void add(int a, int b) {
		int res = a + b;
		System.out.println("Int method");
		System.out.println("Result: "+ res);
	}
	
	public void add(String a, String b) {
		String res = a + b;
		System.out.println("Int method");
		System.out.println("Result: "+ res);
	}

}
