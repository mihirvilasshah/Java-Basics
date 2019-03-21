package com.learn.java.threads;

public class NAThread2 extends Thread{
	 NAThread1 nat1; 
	 public NAThread2(NAThread1 nat1) { 
        this.nat1 = nat1; 
    } 
	 
	public void run() { 
	        synchronized(this.nat1) { 
	            System.out.println 
	            (Thread.currentThread().getName() + "...starts"); 
	  
	            try { 
	                this.nat1.wait(); 
	            } 
	            catch (InterruptedException e) { 
	                e.printStackTrace(); 
	            } 
	            System.out.println 
	            (Thread.currentThread().getName() + "...notified"); 
	        } 
	    }  
}
