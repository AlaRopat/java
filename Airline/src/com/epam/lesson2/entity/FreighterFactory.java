package com.epam.lesson2.entity;

public class FreighterFactory extends PlaneFactory{

	@Override
	public <T> Plane creatorPlane(T... args) {
	
		return new Freighter((String) args[0], (Integer) args[1],
				(Integer) args[2], (Integer) args[3], (Integer) args[4]);
	}

}
