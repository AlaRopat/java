package com.epam.lesson2.entity;

public class Freighter extends Plane {

	private int carryingCapacity;

	public Freighter(String name, int fuel, int range, int staffSeating,
			int carryingCapacity) {
		super(name, fuel, range, staffSeating);
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
		sb.append("Carrying capacity:  ").append(carryingCapacity);
		String s = super.toString() + sb.toString();
		return s;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Freighter other = (Freighter) obj;
		if (!super.equals(other)) {
			return false;
		}
		if (carryingCapacity != other.carryingCapacity)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + carryingCapacity;
		return result;
	}

}
