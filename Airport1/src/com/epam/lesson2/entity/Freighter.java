package com.epam.lesson2.entity;

public class Freighter extends Plane {

	private int carryingCapacity;

	public Freighter(String name, int fuelConsumption, int fligtRange,
			int stuffSeating) {
		super(name, fuelConsumption, fligtRange, stuffSeating);
		this.carryingCapacity = carryingCapacity;

	}

	public int getCarryingCapacity() {
		return carryingCapacity;
	}

	public void setCarryingCapacity(int carryingCapacity) {
		this.carryingCapacity = carryingCapacity;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

}
