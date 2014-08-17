package com.epam.lesson2.entity;

public abstract class Plane {

	private String name;
	private int fuelConsumption;
	private int fligtRange;

	public Plane(String name, int fuelConsumption, int fligtRange) {
		this.name = name;
		this.fuelConsumption = fuelConsumption;
		this.fligtRange = fligtRange;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public int getFligtRange() {
		return fligtRange;
	}

	public void setFligtRange(int fligtRange) {
		this.fligtRange = fligtRange;
	}

	public abstract void fly();

	public abstract String toString();

	public abstract boolean equals(Object obj);

	public abstract int hashCode();
}
