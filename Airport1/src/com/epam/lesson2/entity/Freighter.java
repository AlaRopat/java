package com.epam.lesson2.entity;

public class Freighter extends Plane {

private int carryingCapacity;

	public Freighter(String name, int fuelConsumption, int fligtRange,
			int volumeCargoCompartment,int carryingCapacity	) {
		super(name, fuelConsumption, fligtRange, carryingCapacity);
		this.carryingCapacity=carryingCapacity;
	
	}

public int getCarryingCapacity(){
	return carryingCapacity;
}
public void setCarryingCapacity(int carryingCapacity){
	this.carryingCapacity=carryingCapacity;
}
	@Override
	public void fly(int speed, int height) {

		System.out.println( "Our speed:  " + speed + "\n"
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
