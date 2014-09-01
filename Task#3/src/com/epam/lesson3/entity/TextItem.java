package com.epam.lesson3.entity;


public class TextItem extends TextElement {
	private String content = new String();

	public TextItem(String content) {
		this.content = content;
	}

	public String getTextItem() {
		return this.content;
	}

	public void setTextItem(String content) {
		this.content = content;
	}
}
