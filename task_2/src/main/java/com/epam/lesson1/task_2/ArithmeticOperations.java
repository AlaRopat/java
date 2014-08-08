package com.epam.lesson1.task_2;

import java.util.ArrayList;

public class ArithmeticOperations {
	public  void sequence (double eps, ArrayList<Double> list){
		   double a=0;
		   for(int i=0;;i++){
	   		a=(double) (1/Math.pow((i+1),2));
	   		if(a<eps){
	   			break;
	   		} 
	   		list.add(a);
		   }
		   
	   }
	public double minElement(ArrayList<Double> list){
		double n=0;
		double m=0;
		for(int i=0;i<list.size();i++){
		  n=list.get(0);
		 if(list.get(i)<n){
			 n=list.get(i);
		 }
		 m=i;
		}
		
		 
		return m;
		
		
	}

}
