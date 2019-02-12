package com.learn.java.automobile;

public class Maruti extends Car {

	public Maruti(String r, int m, int n) {
		super(r, m, n);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void steering() {
		// TODO Auto-generated method stub
		super.steering();
		System.out.println("Rough");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		super.brake();
		System.out.println("1.1s");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		super.accelerate();
		System.out.println("100kmph in 14s");
	}
	
	
	

}
