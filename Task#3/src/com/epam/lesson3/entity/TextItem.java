package com.epam.lesson3.entity;

import java.util.Iterator;

import com.epam.lesson3.logic.iterator.NullIterator;


public class TextItem extends TextElement {
	private String content = new String();
private int index=0;
	

	public TextItem(String string, int text) {
		this.content = string;
		this.index=text;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public int getIndex() {
		return this.index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public void print() {
	System.out.print(getContent());
	}
	

	@Override
	public Iterator createrIterator() {
		return new NullIterator();
	}
}
