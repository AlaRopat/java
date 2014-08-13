package com.epam.lesson1;

import java.util.Scanner;

public class Main {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in); 
	TwoDimensionalArray td=new TwoDimensionalArray();
	System.out.println("Enter the size of the matrix");
	String s=sc.next();
	int size=td.changeType(s);
	int [][]mas=new int [size][size];
	td.matrix(mas);
	td.printMatrix(mas);
}
}
