package com.epam.lesson3.manager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.epam.lesson3.entity.Text;
import com.epam.lesson3.entity.TextElement;

public class TextManager {
	public static String buildText(TextElement text) {
		StringBuilder sb = new StringBuilder();
		Iterator iterator = text.createrIterator();
		while (iterator.hasNext()) {
			TextElement element = (TextElement) iterator.next();
			try {
				sb.append(element.getContent());
			} catch (UnsupportedOperationException e) {

			}
		}
		return sb.toString();

	}

	public static TextElement replaceWord(TextElement text, int lengthWord,
			int numberOfSentence) {
		TextElement element = new Text();
		TextElement sentence = new Text();
		Iterator it = text.createrIterator();
		while (it.hasNext()) {
			element = (TextElement) it.next();
			if (element.getIndex() == TextElement.TEXT) {
				try {
					sentence = element.getTextElements().get(numberOfSentence);
//					sentence.print();
//					System.out.println("\n");
					break;

				} catch (Exception e) {
					numberOfSentence -= element.getTextElements().size();
				}
			}
		}
		Iterator iterator = sentence.createrIterator();	
		Pattern rt = Pattern.compile("(\\s\\w{"+lengthWord+"}\\s)");
		
		while (iterator.hasNext()) {
			TextElement word = (TextElement) it.next();
			if (word.getIndex() == TextElement.WORD) {
				Matcher matcher = rt.matcher(word.getContent());
				if(matcher.find()){
			String t=matcher.group();
			System.out.println(t);
				}
			}
		}

		return text;

	}
}
