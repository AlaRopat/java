package com.epam.lesson2.entity;

public abstract class Plane {

	private String name;
	private int fuel;
	private int range;
	private int staffSeating;

	Plane(String name, int fuel, int range, int staffSeating) {
		this.name = name;
		this.fuel = fuel;
		this.range = range;
		this.staffSeating = staffSeating;

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

	public int getStaffSeating() {
		return staffSeating;
	}

	public void setStaffSeating(int staffSeating) {
		this.staffSeating = staffSeating;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: ").append(name).append("\n")
				.append("Fuel consuption: ").append(fuel).append("\n")
				.append("Range flying:  ").append(range).append("\n")
				.append("Seating for staff: ").append(staffSeating)
				.append("\n");
		return sb.toString();
	};
	/*
	 * public boolean equals(Object obj);
	 * 
	 * public int hashCode();
	 */

}
