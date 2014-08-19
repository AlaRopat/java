package com.epam.lesson2.entity;

public abstract class Plane {

	private String name;
	private int fuel;
	private int range;
	private int stuffSeating;

	Plane(String name, int fuel, int range, int stuffSeating) {
		this.name = name;
		this.fuel = fuel;
		this.range = range;
		this.stuffSeating = stuffSeating;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {

		this.fuel = fuel;

	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getStuffSeating() {
		return stuffSeating;
	}

	public void setStuffSeating(int stuffSeating) {
		this.stuffSeating = stuffSeating;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: ").append(name).append("\n")
				.append("Consuption of fuel: ").append(fuel).append("\n")
				.append("Range of flight").append(range).append("\n")
				.append("stuffSeating").append(stuffSeating).append("\n");
		return sb.toString();
	};
	/*
	 * public boolean equals(Object obj);
	 * 
	 * public int hashCode();
	 */

}
