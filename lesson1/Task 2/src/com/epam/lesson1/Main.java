package com.epam.lesson1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArithmeticOperations n = new ArithmeticOperations();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter epsilon from 0 to 1");
		ArrayList<Double> list = new ArrayList<Double>();
		String e = sc.next();
		double eps = n.changeType(e);
		n.checkerValue(eps);
		double m = 0;
		n.sequence(eps, list);
		n.printList(list);
		m = n.minElement(list);
		System.out.println(m + "\n");
	}
}
