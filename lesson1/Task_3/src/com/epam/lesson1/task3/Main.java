package com.epam.lesson1.task3;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
public static void main(String[]args){
	ArrayList<Double> list=new ArrayList<Double> ();
	ArrayList<Double> list2=new ArrayList<Double> ();
	ArithmeticOperations n=new ArithmeticOperations ();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first element");
	String f=sc.next();
	double a=n.changeType(f);
	System.out.println("Enter the last element");
	String l=sc.next();
	double b=n.changeType(l);
	System.out.println("Enter step");
	String s=sc.next();
	double h=n.changeType(s);	
	n.tanges(a, b, h, list, list2);
	System.out.println    ("x"+" "+"         f(x)");
	n.printList(list, list2);
	
}
}
