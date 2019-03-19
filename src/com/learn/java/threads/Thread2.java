package com.learn.java.threads;

import com.learn.java.stack.usingInterface.IntStack;

public class Thread2 implements Runnable {
	public Thread t;
	public IntStack stack;
	
	public Thread2(){
		t = new Thread(this,"Thread2");
	}
	
	public Thread2(IntStack stack){
		t = new Thread(this,"Thread2");
		this.stack = stack;
	}

	@Override
	public void run() {
		System.out.println("Thread2 is running...implements Runnable"); 
		
		for(int i=6; i<=10;i++) {
			stack.push(i);
		}
	}

}
