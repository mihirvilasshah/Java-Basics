package com.learn.java.stack;

public class Stack {
	private int maxSize;
	private int top;

	public Stack(int maxSize) {
		super();
		this.maxSize = maxSize;
		top = -1;
	}

	int stackArr[] = new int[10];  // new int[maxSize];
	
	public void push(int x) {
		if(isFull()) {
			System.out.println("Stack Full!!!");
		} else {
			stackArr[++top] = x;
		}	
	}
	
	public int pop() {
		return stackArr[top--];
	}
	
	public boolean isEmpty() {
	    return (top == -1);
	}
	   
	public boolean isFull() {
	    return (top == maxSize - 1);
	}
	
	public void popAllAndPrint() {
		while (!isEmpty()) {
	        int value = pop();
	        System.out.print(value);
	        System.out.print(" ");
	    }
	}
	
	
}
