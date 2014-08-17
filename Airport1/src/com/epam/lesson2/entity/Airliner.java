package com.epam.lesson2.entity;

public class Airliner extends Plane {
	private int volumePassengerCompartment;
	private int seatingCampacity;

	public Airliner(String name, int fuelConsumption, int fligtRange,
			int volumePassengerCompartment,int seatingCampacity ) {
		super(name, fuelConsumption, fligtRange);
	this.volumePassengerCompartment=volumePassengerCompartment;
	this.seatingCampacity=seatingCampacity;
	}
	public int getVolumePassengerCompartment(){
		return volumePassengerCompartment;
	}
	public void setVolumePassengerCompartment(int volumePassengerCompartment){
		this.volumePassengerCompartment=volumePassengerCompartment;
	}
public int getSeatingCampacity(){
	return seatingCampacity;
}
public void setseatingCampacity(int seatingCampacity){
	this.seatingCampacity=seatingCampacity;
}
	@Override
	public void fly() {
		System.out.println("rrrrrrrrrrrrrrrrrrr");
		
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
