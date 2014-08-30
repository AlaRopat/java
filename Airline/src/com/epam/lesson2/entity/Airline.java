package com.epam.lesson2.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Airline {
	private ArrayList<Plane> planes = new ArrayList<Plane>();

	public List<Plane> getPlanes() {
		return Collections.unmodifiableList(planes);
	}

	public void setPlane(Plane plane) {
		this.planes.add(plane);
	}

	public void setPlanes(ArrayList<Plane> planes) {
		this.planes.addAll(planes);
	}

}
