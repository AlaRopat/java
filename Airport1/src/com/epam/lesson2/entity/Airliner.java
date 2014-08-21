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
		String s = super.toString() + sb.toString();
		return s;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airliner other = (Airliner) obj;
		if (!super.equals(other)) {
			return false;
		}
		if (seatingCapacity != other.seatingCapacity)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + seatingCapacity;
		return result;
	}

}
