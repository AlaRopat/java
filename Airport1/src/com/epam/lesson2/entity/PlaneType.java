package com.epam.lesson2.entity;

public enum PlaneType {

	BOEING_747_200("Boeing_747_200", 14500, 9800, 3, 452, 0),
	BOEING_767_200(	"Boeing_767_200", 4800, 9400, 3, 255, 0),
	T”_154_¡("“”-154¡", 6200,2800, 4, 180, 0),
	AIRBUS_A_310("Airbus A310", 4400, 9170, 4, 280, 0),
	¿Õ_225(	"AH-225", 15920, 5000, 7, 0, 640000), 
	AH_124("AH-124", 12600, 7500,8, 0, 120000);

	private String name;
	private int fuel;
	private int range;
	private int staffSeating;
	private int seatingCapacity;
	private int carryingCapacity;

	PlaneType(String name, int fuel, int range, int staffSeating,
			int seatingCapacity, int carryingCapacity) {
		this.name = name;
		this.fuel = fuel;
		this.range = range;
		this.staffSeating = staffSeating;
		this.seatingCapacity = seatingCapacity;
		this.carryingCapacity = carryingCapacity;
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

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setseatingCapacity(int seatingCampacity) {
		this.seatingCapacity = seatingCampacity;
	}

	public int getCarryingCapacity() {
		return carryingCapacity;
	}

	public void setCarryingCapacity(int carryingCapacity) {
		this.carryingCapacity = carryingCapacity;
	}
}
