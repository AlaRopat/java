package com.epam.lesson2.entity;

public class Freighter extends Plane {
private int volumeCargoCompartment;
private int carryingCapacity;

	public Freighter(String name, int fuelConsumption, int fligtRange,
			int volumeCargoCompartment,int carryingCapacity	) {
		super(name, fuelConsumption, fligtRange);
		this.carryingCapacity=carryingCapacity;
		this.volumeCargoCompartment=volumeCargoCompartment;
	}
public int getVolumeCargoCompartment(){
	return volumeCargoCompartment;
}
public void setVolumeCargoCompartment(int volumeCargoCompartment){
	this.volumeCargoCompartment=volumeCargoCompartment;
}
public int getCarryingCapacity(){
	return carryingCapacity;
}
public void setCarryingCapacity(int carryingCapacity){
	this.carryingCapacity=carryingCapacity;
}
	@Override
	public void fly() {
		System.out.println("trtrtrtrtrtrt");
		
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
