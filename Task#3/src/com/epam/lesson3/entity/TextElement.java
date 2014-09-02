package com.epam.lesson3.entity;

import java.util.Iterator;

public abstract class TextElement {
	public final static int TEXT = 1;
	public final static int CODE = 2;
	public final static int SENTENCE = 3;
	public final static int WORD = 4;
	public final static int SIGN = 5;
	public final static int SPACE = 6;
	public final static int NUMBER = 7;
	private String content = new String();

	public void addElement(TextElement te) {
		throw new UnsupportedOperationException();
	};

	public void removeElement(TextElement te) {
		throw new UnsupportedOperationException();
	};

	public TextElement getElement(int index) {
		throw new UnsupportedOperationException();
	};

	public abstract Iterator createrIterator();

	public abstract void print();

	public abstract int getIndex();

	public String getContent() {
		throw new UnsupportedOperationException();
	}

	public void setContent(String content) {
		throw new UnsupportedOperationException();
	}
}
