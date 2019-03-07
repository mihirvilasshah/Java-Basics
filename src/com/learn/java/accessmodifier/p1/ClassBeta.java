package com.learn.java.accessmodifier.p1;

public class ClassBeta {
	ClassAlpha classAlpha = new ClassAlpha();
	public int betaPub = classAlpha.pub;
//	private int betaPri = classAlpha.pri; // Cannot access private variable in other class
	int betaDef = classAlpha.d; // Can access default variable in same package
}
