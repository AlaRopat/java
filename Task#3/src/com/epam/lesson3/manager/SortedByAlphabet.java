package com.epam.lesson3.manager;

import java.util.Comparator;

import com.epam.lesson3.entity.TextElement;

public class SortedByAlphabet implements Comparator<TextElement> {

	

	@Override
	public int compare(TextElement w1, TextElement w2) {
		return w1.getContent().compareToIgnoreCase(w2.getContent());
		
	}

}