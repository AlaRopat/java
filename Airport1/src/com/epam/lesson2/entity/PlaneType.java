package com.epam.lesson2.entity;

public enum PlaneType {

	BOEING_747_200("Boeing_747_200", 14500, 9800, 3, 452, 0),
	BOEING_767_200("Boeing_767_200", 4800, 9400, 3, 255, 0),
	T”_154_¡("“”-154¡", 6200,2800, 4, 180, 0),
	AIRBUS_A_310("Airbus A310", 4400, 9170, 4, 280, 0),
	¿Õ_225("AH-225", 15920, 5000, 7, 0, 640000),
	AH_124("AH-124", 12600, 7500,8, 0, 120000);

	private String name;
	private int fuelConsumption;
	private int fligtRange;
	private int stuffSeating;
	private int seatingCampacity;
	private int carryingCapacity;

	PlaneType(String name, int fuelConsumption, int fligtRange,
			int stuffSeating, int seatingCampacity, int carryingCapacity) {
		this.name = name;
		this.fuelConsumption = fuelConsumption;
		this.fligtRange = fligtRange;
		this.stuffSeating = stuffSeating;
		this.seatingCampacity = seatingCampacity;
		this.carryingCapacity = carryingCapacity;
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

	public int getSeatingCampacity() {
		return seatingCampacity;
	}

	public void setseatingCampacity(int seatingCampacity) {
		this.seatingCampacity = seatingCampacity;
	}

	public int getCarryingCapacity() {
		return carryingCapacity;
	}

	public void setCarryingCapacity(int carryingCapacity) {
		this.carryingCapacity = carryingCapacity;
	}
	}
