package com.epam.lesson2.entity;

public class Airliner extends Plane {

	private int seatingCampacity;

	public Airliner(String name, int fuel, int range,
			int stuffSeating, int seatingCampacity) {
		super(name, fuel, range, stuffSeating);

		this.seatingCampacity = seatingCampacity;
	}

	public int getSeatingCampacity() {
		return seatingCampacity;
	}

	public void setseatingCampacity(int seatingCampacity) {
		this.seatingCampacity = seatingCampacity;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("seatingCampacity:").append(seatingCampacity);
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
