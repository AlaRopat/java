package com.epam.lesson3;

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

	// public abstract void parse();

	public Iterator<TextElement> getIterator() {
		throw new UnsupportedOperationException();
	};
}
