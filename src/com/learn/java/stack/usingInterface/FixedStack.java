package com.learn.java.stack.usingInterface;

import java.util.ArrayList;
import java.util.Arrays;

public class FixedStack implements IntStack {
	private int stackArr[];
	private int top;
//	private int topNum;

	public FixedStack() {
		super();
		this.top = -1;
		stackArr = new int[5];
	}

	@Override
	public void push(int x) {
		stackArr[++top] = x;
	}

	@Override
	public int pop() {
		return stackArr[top--];
	}

	@Override
	public String toString() {
		return "FixedStack [stackArr=" + Arrays.toString(stackArr) + "]";
	}

}
