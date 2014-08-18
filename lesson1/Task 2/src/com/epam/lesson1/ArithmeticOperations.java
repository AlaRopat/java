package com.epam.lesson1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArithmeticOperations {
	public void sequence(double eps, ArrayList<Double> list) {
		double a = 0;
		for (int i = 0;; i++) {
			a = (double) (1 / Math.pow((i + 1), 2));
			if (a < eps) {
				break;
			}
			list.add(a);
		}
	}

	public double minElement(ArrayList<Double> list) {
		double n = list.get(0);
		double m = 0;
		for (int i = 0; i < list.size(); i++) {
			n = list.get(0);
			if (list.get(i) < n) {
				n = list.get(i);
			}
			m = i;
		}
		return m;
	}

	public void printList(ArrayList<Double> list) {
		Iterator<Double> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	public double changeType(String a) {
		double d = 0;
		try {
			d = Double.parseDouble(a);
		} catch (NumberFormatException e) {
			System.err.println("The format of the input string is incorrect!");
		}
		return d;
	}

	public void checkerValue(double d) {
		if (d > 1 | d < 0) {
			System.out.println("Enter a value from 0 to 1");
		}
	}
}
