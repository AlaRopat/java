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
			int numberOfSentence, String replace) {
		TextElement sentence = new Text();
		Iterator iterator = text.createrIterator();
		while (iterator.hasNext()) {
			TextElement element = (TextElement) iterator.next();
			if (element.getIndex() == TextElement.TEXT) {
				try {
					sentence = element.getTextElements().get(numberOfSentence);
					break;
				} catch (Exception e) {
					numberOfSentence -= element.getTextElements().size();
				}
			}
		}
		Iterator it = sentence.createrIterator();
		while (it.hasNext()) {
			TextElement word = (TextElement) it.next();
			if (word.getIndex() == TextElement.WORD
					&& word.getContent().length() == lengthWord) {
				word.setContent(replace);
			}
		}
		return text;
	}
}
