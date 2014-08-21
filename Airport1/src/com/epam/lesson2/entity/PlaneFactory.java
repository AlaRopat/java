package com.epam.lesson2.entity;
import com.epam.lesson2.entity.Plane;

public abstract class PlaneFactory {
public abstract <T> Plane creatorPlane(T...args);
}
