package com.epam.lesson2.entity;

public class AirlinerFactory extends PlaneFactory {
	
	@Override
	public <T> Plane creatorPlane (T...args) {
		return new Airliner((String) args[0], (Integer) args[1],
				(Integer) args[2], (Integer) args[3], (Integer) args[4]);
		
	}

	

}
