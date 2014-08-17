package com.epam.lesson2.entity;

public class Context {
	private Plane plane;

	public Context() {
	}

	public void setPlane(Plane plane) {
		this.plane = plane;
	}

	public void flyPlane() {
		plane.fly();
	}

}
