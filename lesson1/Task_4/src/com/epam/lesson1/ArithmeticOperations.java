package com.epam.lesson1;

import java.util.ArrayList;



public class ArithmeticOperations {
public void sequence(int[]a,ArrayList<Integer> list){
	for(int i=0;i<a.length/2;i++){
		int n=a.length-1;
		int sum=a[i]+a[n-i];
		list.add(sum);
			}
}
public void random(int[]a){
	for(int i=0;i<a.length;i++){
		a[i]=(int) (Math.random()*30);
	}
}
public int maxElement(ArrayList<Integer> list){
	int max=0;
	for(int i=0;i<list.size();i++){
		if(list.get(i)>max){
			max=list.get(i);
		}
	}
	return max;
	
}
}
