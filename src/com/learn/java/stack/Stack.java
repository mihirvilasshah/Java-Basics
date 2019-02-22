package com.learn.java.stack;

public class Stack {
	private int maxSize;
	private int top;
	private int stackArr[];

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		top = -1;
		stackArr = new int[maxSize];
	}
	
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
	
	private boolean isEmpty() {
	    return (top == -1);
	}
	   
	private boolean isFull() {
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
