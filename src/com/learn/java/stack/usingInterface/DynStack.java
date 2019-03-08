package com.learn.java.stack.usingInterface;

import java.util.ArrayList;

public class DynStack implements IntStack {
	private ArrayList<Integer> stackArr = new ArrayList<>();
	private int top = -1;
	private int topNum;

	@Override
	public void push(int x) {
		stackArr.add(x);
		top++;
	}

	@Override
	public int pop() {
		topNum = stackArr.get(top);
		stackArr.remove(top);
		top--;
		return topNum;
	}

	@Override
	public String toString() {
		return "DynStack [stackArr=" + stackArr + "]";
	}

	
}
