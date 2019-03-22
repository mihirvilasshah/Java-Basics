package com.learn.java.deadlock;

public class DThread1 extends Thread{
	private Common c1; 
    private Common c2; 
   
    public DThread1(Common c1, Common c2) { 
        this.c1 = c1; 
        this.c2 = c2; 
    } 
   
    @Override
    public void run() { 
        c1.sm1(c2); 
    } 
}
