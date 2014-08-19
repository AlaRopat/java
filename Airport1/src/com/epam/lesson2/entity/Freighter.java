package com.epam.lesson2.entity;

public class Freighter extends Plane {

	private int carryingCapacity;

	public Freighter(String name, int fuel, int range,
			int stuffSeating,int carryingCapacity) {
		super(name, fuel, range, stuffSeating);
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
		StringBuilder sb = new StringBuilder();
		sb.append("carryingCapacity").append(carryingCapacity);
		return super.toString()+sb.toString();
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
