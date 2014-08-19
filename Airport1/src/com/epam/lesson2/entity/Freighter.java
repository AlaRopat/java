package com.epam.lesson2.entity;

public class Freighter extends Plane {

	private int carryingCapacity;

	public Freighter(String name, int fuelConsumption, int fligtRange,
			int stuffSeating,int carryingCapacity) {
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
	
		return super.toString()+ "carryingCapacity:  "+carryingCapacity;
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
