//package com.learn.java.multilevel;
//
//import java.util.ArrayList;
//
//public class PathFinder {
//	private ArrayList<String> path = new ArrayList<>();
//	private ArrayList<LevelNode> selNode = new ArrayList<>();
//	private ArrayList<LevelNode> adjSelNode = new ArrayList<>();
//	
//	
//	private void path(LevelNode dest) {		
//		if(!dest.hasParent()) {
//			path.add(dest.getData());
//			return;
//		} else {
//			path(dest.getParent());
//			path.add(dest.getData());	
//		}	
//		return;
//	}
//	
//	private void printPath(LevelNode dest){
//		path(dest);
//		for(String step : path) {
//			System.out.print(" -> "+step);
//		}
//	}
//	
//	public void printPathOfSelectedNodes() {
//		adjustSelectedNode();
//		for(LevelNode node: adjSelNode ) {
//			printPath(node);
//			path.removeAll(path);
//			System.out.println();
//		}
//	}
//	
//	public void selectNode(LevelNode node) {
//		if(!ansectorMatch(node)) {
//			selNode.add(node);
//		}		
//	}
//	
//	private void adjustSelectedNode() {
//		for(LevelNode node : selNode) {
//			int count = 0;
//			for(LevelNode node2 : selNode) {
//				if(!isAncestorOf(node2,node)) {	
//					count++;
//				}
//			}
//			if(count == selNode.size()) {
//				adjSelNode.add(node);
//			}
//		}
//	}
//	
//	private boolean isAncestorOf(LevelNode n2, LevelNode n1) {
//		for(LevelNode anc : n1.getAncestor()) {
//			if(anc == n2) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	private boolean ansectorMatch(LevelNode node) {
//		for(LevelNode sn : selNode) {
//			for(LevelNode anc : node.getAncestor()) {
//				if(sn == anc) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}
//
//}
