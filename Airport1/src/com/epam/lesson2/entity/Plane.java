package com.epam.lesson2.entity;

public abstract class Plane {

	private String name;
	private int fuelConsumption;
	private int fligtRange;
	private int stuffSeating;

	Plane(String name, int fuelConsumption, int fligtRange, int stuffSeating) {
		this.name = name;
		this.fuelConsumption = fuelConsumption;
		this.fligtRange = fligtRange;
		this.stuffSeating = stuffSeating;

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

	public int getStuffSeating() {
		return fligtRange;
	}

	public void setStuffSeating(int stuffSeating) {
		this.stuffSeating = stuffSeating;
	}

	/*
	 * public String toString();
	 * 
	 * public boolean equals(Object obj);
	 * 
	 * public int hashCode();
	 */

}
