package com.learn.java.deadlock.example;

public class DeadlockFixed {
	static boolean r1InUse = false;
    static boolean r2InUse = false;
    
    static void setR1(boolean value) {
    	r1InUse = value;
    }
    
    static void setR2(boolean value) {
    	r2InUse = value;
    }
    
	public static void main(String[] args) {  
	    Class<Integer> resource1 = Integer.class;  
	    Class<String> resource2 = String.class;  
	    
	    // t1 tries to lock resource1 then resource2
	    // Creating thread using anonymous subclass
	    Thread t1 = new Thread("Thread1") {  
	      public void run() {
	    	  System.out.println("Started: "+Thread.currentThread().getName());
	          synchronized (resource1) {  
		           System.out.println("Thread 1: locked resource 1");  
		           System.out.println(resource1.getName());
			       System.out.println(resource1.getMethods());
			       
			       int i = 1;  
			       while(r2InUse) {
			    	   System.out.println((i++) + " "+Thread.currentThread() + "waiting for r1");
			       }
		  
		           synchronized (resource2) {  
		            System.out.println("Thread 1: locked resource 2");
		            System.out.println(resource2.getName());
				    System.out.println(resource2.getMethods());
		           }
		           setR2(false);
		           System.out.println(Thread.currentThread()+"released"+resource2.getName());
	         }
	         setR1(false); 
	         System.out.println(Thread.currentThread()+"released"+resource1.getName()); 
	      }  
	    };  
	  
	    // t2 tries to lock resource2 then resource1  
	    Thread t2 = new Thread("Thread2") {	
	      public void run() {
	    	System.out.println("Started: "+Thread.currentThread().getName());  
	        synchronized (resource1) { 
	          setR1(true);	
	          System.out.println("Thread 2: locked resource 1");
	          System.out.println(resource1.getName());
		      System.out.println(resource2.getMethods());
		      
		       int i = 1;  
		       while(r2InUse) {
		    	   System.out.println((i++) + " "+Thread.currentThread() + "waiting for r1");
		       }
	  
	          synchronized (resource2) { 
	        	setR2(true);  
	            System.out.println("Thread 2: locked resource 2");
	            System.out.println(resource2.getName());
			    System.out.println(resource2.getMethods());
	          }
	          setR2(false);
	          System.out.println(Thread.currentThread()+" released "+resource2.getName());
	        }
	        setR1(false);
	        System.out.println(Thread.currentThread()+" released "+resource1.getName());
	      }  
	    };  
	  
	      
	    t1.start();  
	    t2.start();  
	    
	    try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("Threads stopped");
	  }  
}
