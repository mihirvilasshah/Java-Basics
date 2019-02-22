package com.learn.java.narytree;

import java.util.ArrayList;

public class NaryTree {
	int n;
	String data;
	
	
	
	public NaryTree(int n, String data) {
		super();
		this.n = n;
		this.data = data;
	}

	NaryTreeNode root = new NaryTreeNode(data, n);
	
	private boolean addChild(NaryTreeNode node) {
        if (node.children.size() < node.n) {
            return node.children.add(node);
        }

        return false;
    }
	
	public boolean addChild(String data) {
        return addChild(new NaryTreeNode(data, n));
    }
	
	public ArrayList<NaryTreeNode> getChildren() {
        return new ArrayList<>(root.children);
    }
	
	

}
