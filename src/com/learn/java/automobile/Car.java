package com.learn.java.automobile;

public class Car extends FourWheeler {

	public Car(String r, int m, int n) {
		super(r, m, n);
		// TODO Auto-generated constructor stub
	}
	
	public void steering() {
		System.out.println("Steering");
	}
	public void brake() {
		System.out.println("Brake");
	}
	
	public void accelerate() {
		System.out.println("Accelerate");
	}
	

}
