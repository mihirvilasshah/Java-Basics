package com.learn.java.threads;

import com.learn.java.stack.usingInterface.IntStack;

public class Thread1 extends Thread {
	public IntStack stack;
	
	public Thread1(IntStack stack) {
		this.stack = stack;
	}

	@Override
	public void run() {
		System.out.println("Thread1 is running...extends Thread"); 
		
		for(int i=1; i<=5;i++) {
			stack.push(i);
		}
	}

	
}
