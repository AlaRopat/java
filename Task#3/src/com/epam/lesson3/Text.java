package com.epam.lesson3;

import java.util.ArrayList;
import java.util.Iterator;

public class Text extends TextElement {
	private ArrayList<TextElement> textElements = new ArrayList<TextElement>();

	@Override
	public void addElement(TextElement te) {
		textElements.add(te);
	}

	@Override
	public void removeElement(TextElement te) {
		textElements.remove(te);

	}

	@Override
	public TextElement getElement(int index) {

		return (TextElement) textElements.get(index);
	}

	@Override
	public Iterator<TextElement> getIterator() {

		return textElements.iterator();
	}

}
