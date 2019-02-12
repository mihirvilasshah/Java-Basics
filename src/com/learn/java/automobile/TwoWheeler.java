package com.learn.java.automobile;

public class TwoWheeler extends Vehicle{
	int noofwheel;
	public TwoWheeler(String r,int m,int n)
    {
        super(r,m);
        noofwheel=n;
    }
    public void display()
    {
        System.out.println("Two wheeler");
        super.display();
        System.out.println("No. of wheel : " +noofwheel);
    }

}
