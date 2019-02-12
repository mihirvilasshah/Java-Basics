package com.learn.java.automobile;

public class TwoWheeler extends Vehicle{

	public TwoWheeler(String r,int m,int n)
    {
        super(r,m,n);
    }
    public void display()
    {
        System.out.println("Two wheeler");
        super.display();
//        System.out.println("No. of wheel : " +n);
    }
	@Override
	public void test() {
		// TODO Auto-generated method stub
		super.test();
		System.out.println("Passed two wheeler test");
	}   
}
