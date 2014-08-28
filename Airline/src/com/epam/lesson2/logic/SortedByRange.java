package com.epam.lesson2.logic;

import java.util.Comparator;

import com.epam.lesson2.entity.Plane;

public class SortedByRange implements Comparator<Plane> {

	@Override
	public int compare(Plane plane1, Plane plane2) {
		int range1=plane1.getRange();
		int range2=plane2.getRange();
		if(range1 > range2) {
            return 1;
     }
     else if(range1 < range2) {
            return -1;
     }
     else {
            return 0;
     }
	}

}
