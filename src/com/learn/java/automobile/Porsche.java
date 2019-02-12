package com.learn.java.automobile;

public class Porsche extends Car {

	public Porsche(String r, int m, int n) {
		super(r, m, n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void steering() {
		// TODO Auto-generated method stub
		super.steering();
		System.out.println("Leather");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		super.brake();
		System.out.println("0.1s");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		super.accelerate();
		System.out.println("100kmph in 2s");
	}

	
	
	
	
	

}
