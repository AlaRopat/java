package com.epam.lesson2.entity;

public   class Plane {

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
	
	  @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plane other = (Plane) obj;
		if (fuel != other.fuel)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (range != other.range)
			return false;
		if (staffSeating != other.staffSeating)
			return false;
		return true;
	};
	 
	  @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fuel;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + range;
		result = prime * result + staffSeating;
		return result;
	};
	 

}
