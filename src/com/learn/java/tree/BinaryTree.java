package com.learn.java.tree;

public class BinaryTree {
	public Node root1, root2;
	
	public boolean identicalBinaryTrees(Node n1, Node n2)  
    {    
        if (n1 != null && n2 != null)  
            return (n1.data == n2.data && identicalBinaryTrees(n1.left, n2.left) && identicalBinaryTrees(n1.right, n2.right)); 
        else if (n1 == null && n2 == null) 
            return true;
        return false; 
    }
}
