package com.learn.java.automobile;

public class FourWheeler extends Vehicle{

    public FourWheeler(String r,int m,int n)
    {
        super(r,m,n);
 
    }
    public void display()
    {
        System.out.println("Four wheeler");
        super.display();
    }
    @Override
	public void test() {
		// TODO Auto-generated method stub
		super.test();
		System.out.println("Passed four wheeler test");
	}
}
