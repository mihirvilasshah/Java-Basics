package com.learn.java.nestedClass;

public class Outer {
	int x = 5;
	
	public Outer() {
		Inner inner = new Inner();
		inner.display();
	}
	
	public class Inner {
		int x = 10;
		
		public void display() {
			System.out.println("Display x value of outer from inner: " + Outer.this.x);
			System.out.println("Display x value of inner from inner using this: " + this.x);
			System.out.println("Display x value of inner from inner: " + x);
		}
		
		
	}

}
