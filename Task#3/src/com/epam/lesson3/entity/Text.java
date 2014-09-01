package com.epam.lesson3.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Text extends TextElement {
	private ArrayList<TextElement> textElements = new ArrayList<TextElement>();
	Iterator iterator=null;
	public List<TextElement> getTextElements() {
		return Collections.unmodifiableList(textElements);

	}

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
	public void print(){
		iterator=textElements.iterator();
		while(iterator.hasNext()){
			TextElement te=(TextElement)iterator.next();
			te.print();
		}
	}

	/*public Iterator createrIterator(){
		if(iterator==null){
			iterator=new TextIterator(textElements.iterator());
		}
		return iterator;
	}*/

}
