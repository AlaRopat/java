package com.epam.lesson1.task_2;

import java.util.ArrayList;


public class Main
{
    public static void main( String[] args )
    {
    	ArrayList<Double> list=new ArrayList<Double> ();
    	double eps=0.1;
    	double m=0;
    	ArithmeticOperations n=new ArithmeticOperations ();
    	n.sequence(eps,list);
    	 for(int i=0;i<list.size();i++){
    System.out.println(list.get(i));
    }
    	m=n.minElement(list);
    	  System.out.println(m+"\n");
    }
}
