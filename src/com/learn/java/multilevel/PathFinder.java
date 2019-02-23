package com.learn.java.multilevel;

import java.util.ArrayList;

public class PathFinder {
	private ArrayList<String> path = new ArrayList<>();
	private void path(LevelNode src, LevelNode dest) {
		if(dest == src) {
			path.add(dest.getData());
			return;
		} else {
			path(src, dest.getParent());
			path.add(dest.getData());	
		}
		
		return;
	}
	
	
	public void printPath(LevelNode src, LevelNode dest){
		path(src, dest);
		for(String step : path) {
			System.out.print("->"+step);
		}
	}
	
	public void path(LevelNode dest) {		
		System.out.print("<-"+dest.getData());
		if(dest.hasParent()) {
			path(dest.getParent());
		}
		return;
	}

}
