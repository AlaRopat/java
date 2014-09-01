package com.epam.lesson3.entity;

import java.util.Iterator;

public abstract class TextElement {
	public void addElement(TextElement te) {
		throw new UnsupportedOperationException();
	};

	public void removeElement(TextElement te) {
		throw new UnsupportedOperationException();
	};

	public TextElement getElement(int index) {
		throw new UnsupportedOperationException();
	};

	public Iterator<TextElement> getIterator() {
		throw new UnsupportedOperationException();
	};
//	public void print(TextElement te){
//		throw new UnsupportedOperationException();
//	}
}
