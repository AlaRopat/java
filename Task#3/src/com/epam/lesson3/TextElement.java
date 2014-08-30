package com.epam.lesson3;

import java.util.Iterator;

public abstract class TextElement {
	public abstract void addElement();

	public abstract void removeElement();

	public abstract TextElement getElement(int index);

//	public abstract void parse();

	public abstract Iterator<TextElement> getIterator();
}
