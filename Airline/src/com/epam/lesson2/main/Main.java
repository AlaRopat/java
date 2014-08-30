package com.epam.lesson2.main;

import java.util.*;

import com.epam.lesson2.entity.Airline;
import com.epam.lesson2.entity.AirlinerFactory;
import com.epam.lesson2.entity.FreighterFactory;
import com.epam.lesson2.entity.Plane;

import com.epam.lesson2.logic.AirlineManager;
import com.epam.lesson2.logic.SortedByFuel;
import com.epam.lesson2.logic.SortedByRange;

public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Airline airline = new Airline();
		AirlinerFactory ap = new AirlinerFactory();
		FreighterFactory fp = new FreighterFactory();

		airline.setPlane(ap.creatorPlane("Boeing_747_200", 14500, 9800, 3, 452));
		airline.setPlane(ap.creatorPlane("Boeing_767_200", 4800, 9400, 3, 255));
		airline.setPlane(ap.creatorPlane("рс-154а", 6200, 2800, 4, 180));
		airline.setPlane(ap.creatorPlane("Airbus A310", 4400, 9170, 4, 280));
		airline.setPlane(fp.creatorPlane("AH-225", 15920, 5000, 7, 640000));
		airline.setPlane(fp.creatorPlane("AH-124", 12600, 7500, 8, 120000));

		int[] s = { 0, 0 };
		s = AirlineManager.seating(airline);
		System.out.println(" Total seating capacity:  " + s[0] + "\n");
		System.out.println(" Total carrying capacity:  " + s[1] + "\n");

		Comparator<Plane> RangeComparator = new SortedByRange();
		Comparator<Plane> FuelComparator1 = new SortedByFuel();

		for (Plane p : AirlineManager.getPlaneRange(RangeComparator, airline)) {

			System.out.println("Name: " + p.getName() + "\n" + "Range flying: "
					+ p.getRange() + "\n");
		}
		AirlineManager.getPlaneRange(FuelComparator1, airline);
		String planeName = new String();
		planeName = AirlineManager.findPlaneByFuel(airline, 14500, 15900);
		System.out.println("The name of the plane: " + planeName);

	}
}
