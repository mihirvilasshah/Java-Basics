package com.learn.java.multilevel;

import java.util.ArrayList;

public class LevelNode {
	private String data;
    private ArrayList<LevelNode> children;
    private LevelNode parent;
    
	public LevelNode(String data) {
		super();
		this.data = data;
		children = new ArrayList<>();
	}
	
	public void addChild(LevelNode child) {
		child.parent = this;
		this.children.add(child);
	}
	
	public boolean hasParent() {
		if(this.parent==null) {
			return false;
		} else {
			return true;
		}
	}

	public String getData() {
		return data;
	}

	public LevelNode getParent() {
		return parent;
	}

	public ArrayList<LevelNode> getChildren() {
		return children;
	}
	
}
