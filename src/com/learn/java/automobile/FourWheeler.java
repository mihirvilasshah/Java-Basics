package com.learn.java.automobile;

public class FourWheeler extends Vehicle{
	int noofwheel;
    public FourWheeler(String r,int m,int n)
    {
        super(r,m);
        noofwheel=n;
    }
    public void display()
    {
        System.out.println("Four wheeler");
        super.display();
        System.out.println("No. of wheels:" +noofwheel);
    }

}
