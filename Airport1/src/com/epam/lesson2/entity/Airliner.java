package com.epam.lesson2.entity;

public class Airliner extends Plane {

	private int seatingCapacity;

	public Airliner(String name, int fuel, int range, int staffSeating,
			int seatingCapacity) {
		super(name, fuel, range, staffSeating);

		this.seatingCapacity = seatingCapacity;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setseatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Seating capacity:  ").append(seatingCapacity);
		return super.toString() + sb.toString();
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
