package com.epam.lesson2.main;

import com.epam.lesson2.entity.Airliner;
import com.epam.lesson2.entity.Freighter;
import com.epam.lesson2.entity.Plane;
import com.epam.lesson2.entity.PlaneFactory;
import com.epam.lesson2.entity.PlaneType;

public class Main {
	public static void main(String[] args) {
		Plane plane;
		plane = PlaneFactory.buildPlane(PlaneType.BOEING_767_200);
		System.out.println(plane.toString());
	}
}
