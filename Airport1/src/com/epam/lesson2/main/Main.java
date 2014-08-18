package com.epam.lesson2.main;

import com.epam.lesson2.entity.Airliner;
import com.epam.lesson2.entity.Context;
import com.epam.lesson2.entity.Freighter;

public class Main {
public static void main(String[] args){
	Context context = new Context();
	context.setPlane(new Airliner("ah-47", 56, 78, 56, 14));
	context.flyPlane(56,74);
	context.setPlane(new Freighter("ah-47", 56, 78, 56, 14));
	context.flyPlane(87,45);
	
}
}
