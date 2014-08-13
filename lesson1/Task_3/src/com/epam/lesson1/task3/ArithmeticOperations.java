package com.epam.lesson1.task3;

import java.util.ArrayList;
import java.util.Iterator;



public class ArithmeticOperations {
public void tanges(double a,double b,double h,
ArrayList<Double> list,ArrayList<Double> list2){
	double f=0;
	for(double i=a; i<=b;i+=h){
		f=Math.tan(2*i)-3;
			list.add(i);
			list2.add(f);}
	
}
public  double changeType(String a){
	 double d=0;
	 try {
		 d = Double.parseDouble(a);
		  } catch (NumberFormatException e) {
	        System.err.println("The format of the input string is incorrect!");
	    }
return d; }
public void printList(ArrayList<Double> list,
		ArrayList<Double> list2){
	Iterator<Double> l1=list.iterator();
	Iterator<Double> l2=list2.iterator();
	while(l1.hasNext()){
		System.out.println(l1.next()+" | "+l2.next());
	}
}
}
