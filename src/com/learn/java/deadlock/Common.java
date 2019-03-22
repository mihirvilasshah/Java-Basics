package com.learn.java.deadlock;

public class Common {

	synchronized void sm1(Common c) { 
        System.out.println("sm1-begin"); 
        ThreadUtil.sleep(1000); 
  
        c.sm1(this); 
        System.out.println("sm1-end"); 
    } 
	
	synchronized void sm2(Common c) { 
        System.out.println("sm2-begin"); 
        ThreadUtil.sleep(1000); 

        c.sm1(this); 
        System.out.println("sm2-end"); 
    } 
}
