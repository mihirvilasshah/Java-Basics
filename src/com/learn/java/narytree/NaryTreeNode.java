package com.learn.java.narytree;

import java.util.ArrayList;

public class NaryTreeNode {
	String data;
    ArrayList<NaryTreeNode> children;
    int n;
    
    public NaryTreeNode(String data, int n) {
        this.data = data;
        this.n = n;
        children = new ArrayList<>(n);
    }
    
    private boolean addChild(NaryTreeNode node) {
        if (children.size() < n) {
            return children.add(node);
        }

        return false;
    }

    public boolean addChild(String data) {
        return addChild(new NaryTreeNode(data, n));
    }

    public ArrayList<NaryTreeNode> getChildren() {
        return new ArrayList<>(children);
    }

    public NaryTreeNode getChild(int index) {
        if (index < children.size()) {
            return children.get(index);
        }
        return null;
    }
    
    public static void print(NaryTreeNode root) {
        printUtil(root, 0);
    }

    public static void printUtil(NaryTreeNode node, int depth) {
        for (int i = 0; i < depth; ++i) {
            System.out.print("   ");
        }

        System.out.println(node.data);

        for (NaryTreeNode child : node.getChildren()) {
            printUtil(child, depth + 1);
        }
    }
      
}
