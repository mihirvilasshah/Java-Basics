package com.learn.java.threads;

public class NAThread3 extends Thread{
	NAThread1 nat1;  
	public NAThread3(NAThread1 nat1) { 
        this.nat1 = nat1; 
    } 
	
	public void run() { 
        synchronized(this.nat1) { 
            System.out.println 
            (Thread.currentThread().getName() + "...starts"); 
  
            this.nat1.notifyAll(); 
//            this.nat1.notify();
            System.out.println 
            (Thread.currentThread().getName() + "...notified"); 
        } 
    } 
}
