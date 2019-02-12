package com.learn.java.automobile;

public class Vehicle {
	private String regno;
    private int model;
    Vehicle(String r, int m)
    {
        regno=r;
        model=m;
    }
    void display()
    {
        System.out.println("Registration no: "+regno);
        System.out.println("Model no: "+model);
    }
    
    //Driver d3 = new Driver(two/four);

}
