package com.epam.lesson2.logic;

import java.util.Comparator;

import com.epam.lesson2.entity.Plane;

public class SortedByFuel implements Comparator<Plane>{

	@Override
	public int compare(Plane plane1, Plane plane2) {
		int fuel1=plane1.getFuel();
		int fuel2=plane2.getFuel();
		if(fuel1 > fuel2) {
            return 1;
     }
     else if(fuel1 < fuel2) {
            return -1;
     }
     else {
            return 0;
     }
	}
		
}
