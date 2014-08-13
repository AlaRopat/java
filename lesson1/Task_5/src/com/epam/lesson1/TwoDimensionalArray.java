package com.epam.lesson1;

public class TwoDimensionalArray {
public void matrix(int [][]a){
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a.length;j++){
			int n=a.length-1;
			a[i][i]=1;
			a[i][n-i]=1;
		}
	}
}
public void printMatrix(int[][]a){
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a.length;j++){
			System.out.print(a[i][j]+" ");
		}System.out.println();
	}}
public  int changeType(String a){
	 int d=0;
	 try {
		  d = Integer.parseInt(a);
		  if(d<=0){
			  System.out.println("Enter a value > 0");
		  }
		 
		  } catch (NumberFormatException e) {
	        System.err.println("The format of the input string is incorrect!");
	    }
return d; }
}
