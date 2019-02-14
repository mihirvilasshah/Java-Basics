package com.learn.java.arrays;

public class ThreeDArray {
	public void print3DArray(int a, int b, int c) {
		if(a>0 && b>0 && c>0) {
			int arr[][][] = new int[a][b][c];
		      int i, j, k, num=1;
			  
		      for(i=0; i<a; i++){
		          for(j=0; j<b; j++){
		              for(k=0; k<c; k++){
		                  arr[i][j][k] = num;
		                  num++;
		              }
		          }
		      }
			  
		       for(i=0; i<a; i++){
		          for(j=0; j<b; j++){
		              for(k=0; k<c; k++){
		                  System.out.print("arr[" +i+ "][" +j+ "][" +k+ "] = " +arr[i][j][k]+ "\t");
		              }
		              System.out.println();
		          }
		          System.out.println();
		      }
		   } else {
			   System.out.println("All parameters must be > 0");
		   }
		}
}
