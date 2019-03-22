package com.learn.java.deadlock;

public class ThreadUtil {
	static void sleep(long millis) { 
        try { 
            Thread.sleep(millis); 
        } 
        catch (InterruptedException e) { 
            e.printStackTrace(); 
        } 
    } 
}
