package com.epam.lesson3.logic.parse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.epam.lesson3.entity.Text;
import com.epam.lesson3.entity.TextElement;
import com.epam.lesson3.entity.TextItem;
import com.epam.lesson3.manager.FileManager;
import com.epam.lesson3.manager.TextManager;

public class TextParse {

	public TextParse() {

	}

	public TextElement parseToText(TextElement wholeText, String text) {

		TextElement textList = new Text();

		Pattern rt = Pattern.compile(FileManager.getProperty().getProperty(
				"regex.REGEX_BLOCK_OF_CODE"));
		String paragraph = new String();
		String code = new String();
		String[] te = rt.split(text);
		Matcher matcher = rt.matcher(text);

		for (int i = 0; i < te.length; i++) {
			paragraph = te[i];
			textList.addElement(parseToSentence(paragraph));
			
			wholeText.addElement(textList.getElement(i));
			if (matcher.find()) {
				code = matcher.group();
				wholeText.addElement(new TextItem(code, TextElement.CODE));
			}
		}

		return wholeText;

	}

	private TextElement parseToSentence(String paragraph) {
		TextElement sentenceList = new Text();
		Pattern rt = Pattern.compile(FileManager.getProperty().getProperty(
				"regex.REGEX_SENTENCE"));
		Matcher matcher = rt.matcher(paragraph);
		String sentence = new String();
		while (matcher.find()) {
			sentence = matcher.group();

			sentenceList.addElement(parseToWord(sentence));
			sentenceList.setIndex(TextElement.TEXT);
			
		}

		return sentenceList;

	}

	private TextElement parseToWord(String sentence) {
		TextElement wordSignList = new Text();
		Pattern rt = Pattern.compile(FileManager.getProperty().getProperty(
				"regex.REGEX_WORD_AND_SIGN"));
		Matcher matcher = rt.matcher(sentence);

		String word = new String();
		String sign = new String();
		String space = new String();
		String number = new String();
		while (matcher.find()) {
			if ((word = matcher.group(1)) != null) {

				wordSignList.addElement(new TextItem(word, TextElement.WORD));
			}
			if ((space = matcher.group(2)) != null) {

				wordSignList.addElement(new TextItem(space, TextElement.SPACE));
			}
			if ((sign = matcher.group(3)) != null) {

				wordSignList.addElement(new TextItem(sign, TextElement.SIGN));
			}
			if ((number = matcher.group(4)) != null) {

				wordSignList
						.addElement(new TextItem(number, TextElement.NUMBER));
			}
			
		}
		wordSignList.setIndex(TextElement.SENTENCE);
		return wordSignList;
	}

}
