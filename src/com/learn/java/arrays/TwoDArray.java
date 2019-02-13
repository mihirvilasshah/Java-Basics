package com.learn.java.arrays;

public class TwoDArray {
	
	public void printStepArray(int n) {
		int twoD[][] = new int[n][];
		for(int i=0;i<n;i++) {
			twoD[i] = new int[i+1];	
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				twoD[i][j] = j+1;
				System.out.print(twoD[i][j]);
			}
			System.out.println();
		}
	}
	
	public void printProduct(int n) {
		int a = 1;
		int b = 2;
		
		float c = a*b;
		System.out.println(c);
		
		float[] arr[] = new float[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = i*j;
				System.out.print("arr[" +i+ "][" +j+ "]= " +arr[i][j]+ "\t");
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
		}
	}

}
