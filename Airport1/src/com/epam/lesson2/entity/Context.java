package com.epam.lesson2.entity;

public class Context {
	private Plane plane;

	public Context() {
	}

	public void setPlane(Plane plane) {
		this.plane = plane;
	}

	public void flyPlane(int speed,int height) {
		plane.fly( speed, height);
	}

}
