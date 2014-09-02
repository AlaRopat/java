package com.epam.lesson3.logic.iterator;

import java.util.Iterator;
import java.util.Stack;

import com.epam.lesson3.entity.Text;
import com.epam.lesson3.entity.TextElement;


public class TextIterator implements Iterator {

	Stack stack = new Stack();

	
	public TextIterator(Iterator iterator) {
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if(stack.empty()){
			return false;
		}else{
			Iterator iterator =(Iterator)stack.peek();
			if(!iterator.hasNext()){
				stack.pop();
				return hasNext();
			}else{
				return true;
			}
		}
		
	}


	@Override
	public Object next() {
		if (hasNext()) {
			Iterator iterator = (Iterator) stack.peek();
			TextElement element = (TextElement) iterator.next();
			if (element instanceof Text) {
				stack.push(element.createrIterator());
			}
			return element;
		} else {
			return null;
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException(); 

	}

}
