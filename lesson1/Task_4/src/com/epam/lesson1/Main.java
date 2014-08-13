package com.epam.lesson1;

import java.util.ArrayList;

public class Main {
public static void main(String[]args){
	ArithmeticOperations n=new ArithmeticOperations();
	int[]mas=new int[20];
	n.random(mas);
	ArrayList <Integer> list=new ArrayList<Integer>();
	n.sequence(mas, list);
	System.out.println("Sequence"+"\n"+list);
	int max=n.maxElement(list);
	System.out.println("Maximal element"+"\n"+max);
	
}
}
