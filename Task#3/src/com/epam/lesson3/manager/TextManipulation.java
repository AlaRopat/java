package com.epam.lesson3.manager;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.epam.lesson3.entity.Text;
import com.epam.lesson3.entity.TextElement;

public class TextManipulation {
	public static String buildText(Text text) {
		StringBuilder sb = new StringBuilder();
		Iterator iterator = text.createrIterator();
		while(iterator.hasNext()){
			TextElement element=(TextElement)iterator.next();
			try{
			sb.append(element.getContent());
			}catch(UnsupportedOperationException e){
				
			}
		}
		return sb.toString();
		

	}
	
}
