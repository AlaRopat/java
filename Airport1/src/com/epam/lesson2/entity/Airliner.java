package com.epam.lesson2.entity;

public class Airliner extends Plane {

	private int seatingCampacity;

	public Airliner(String name, int fuelConsumption, int fligtRange,
			int stuffSeating, int seatingCampacity) {
		super(name, fuelConsumption, fligtRange, stuffSeating);

		this.seatingCampacity = seatingCampacity;
	}

	public int getSeatingCampacity() {
		return seatingCampacity;
	}

	public void setseatingCampacity(int seatingCampacity) {
		this.seatingCampacity = seatingCampacity;
	}

	@Override
	public void fly(int speed, int height) {

		System.out.println("We are flying! \n" + "Our speed:  " + speed + "\n"
				+ "Our height:  " + height + "\n");

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
