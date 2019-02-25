package com.learn.java.multilevel;

import java.util.ArrayList;

public class LevelNode {
	private String data;
    private ArrayList<LevelNode> children;
    private boolean isSelected;
//    private LevelNode parent;
//    private ArrayList<LevelNode> ancestor;
    
	public LevelNode(String data) {
		super();
		this.data = data;
		children = new ArrayList<>();
//		ancestor = new ArrayList<>();
	}
	
	public void addChild(LevelNode child) {
//		child.parent = this;
//		child.ancestor.add(this);
//		if(hasAncestor()) {
//			for(LevelNode anc : ancestor) {
//				child.ancestor.add(anc);	
//			}
//		}

		this.children.add(child);
	}
	
//	public boolean hasParent() {
//		if(this.parent==null) {
//			return false;
//		} else {
//			return true;
//		}
//	}
	
//	public boolean hasAncestor() {
//		if(this.ancestor==null) {
//			return false;
//		} else {
//			return true;
//		}
//	}
	
	private boolean hasChildren() {
		if(this.children==null) {
			return false;
		} else {
			return true;
		}
	}

	public String getData() {
		return data;
	}

//	public LevelNode getParent() {
//		return parent;
//	}

//	public ArrayList<LevelNode> getAncestor() {
//		return ancestor;
//	}

	private ArrayList<LevelNode> getChildren() {
		return children;
	}
	
	public void select() {
		isSelected = true;	
	}
	
	ArrayList<String> path = new ArrayList<>();
	public boolean printPath() {
		if(this.isSelected) {
//			System.out.print(" -> " + this.data);
			path.add(this.data);
			return true;
		} else if(hasChildren()) {
//			if(hasChildren()) {
				for (LevelNode child : this.getChildren()) {
//					System.out.print(" -> " + this.data);
//					child.printPath();
					if(child.printPath()) {
						path.add(this.data);
					}
						
				}
				
//			}
			
			
		}
		System.out.println(path);
		return false;
	}
	
}
