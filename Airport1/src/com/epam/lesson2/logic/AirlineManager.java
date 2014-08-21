package com.epam.lesson2.logic;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.epam.lesson2.entity.Airline;
import com.epam.lesson2.entity.Airliner;
import com.epam.lesson2.entity.Freighter;
import com.epam.lesson2.entity.Plane;

public class AirlineManager {

	public static int[] seating(Airline airline) {
		int[] seating = { 0, 0 };
		for (Plane p : airline.getPlanes()) {
			if (p.getClass() == Airliner.class) {
				seating[0] += ((Airliner) p).getSeatingCapacity();
			}

			else {
				seating[1] += ((Freighter) p).getCarryingCapacity();
			}
		}
		return seating;
	}

	public static String findPlaneByFuel(Airline airline, int lowValue,
			int highValue) {
		String planeName = new String();
		for (Plane p : airline.getPlanes()) {
			if (p.getFuel() >= lowValue && p.getFuel() <= highValue) {
				planeName = p.getName();
			}
		}
		return planeName;

	}

	public static List<Plane> getPlaneRange(Comparator<Plane> comparator,
			Airline airline) {

		ArrayList<Plane> list = new ArrayList<Plane>(airline.getPlanes());
		Collections.sort(list, comparator);
		return Collections.unmodifiableList(list);
	}

}
