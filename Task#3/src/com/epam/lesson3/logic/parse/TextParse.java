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
import com.epam.lesson3.manager.TextManager;

public class TextParse {
	 
	public TextParse() {
		
	}

	public String readFile(String filePath) {
		String text = new String();
		try {
			FileReader fr = new FileReader(filePath);
			Scanner scan = new Scanner(fr);
			while (scan.hasNextLine()) {
				text += scan.nextLine();
				text += "\n";
			}

		} catch (FileNotFoundException e) {
			System.err.println(e);
		}

		return text;

	}

	public Text parseToText(Text wholeText, String text) {

		Text textList = new Text();

		Pattern rt = Pattern.compile(TextManager.getProperty().getProperty("regex.REGEX_BLOCK_OF_CODE"));
		String paragraph = new String();
		String code = new String();
		String[] te = rt.split(text);
		Matcher matcher = rt.matcher(text);

		for (int i = 0; i < te.length; i++) {
			paragraph = te[i];
			textList.addElement(parseToSentence(paragraph));
			textList.setIndex(TextElement.TEXT);
			wholeText.addElement(textList.getElement(i));
			if (matcher.find()) {
				code = matcher.group();
				wholeText.addElement(new TextItem(code, TextElement.CODE));
			}
		}

		return wholeText;

	}

	private Text parseToSentence(String paragraph) {
		Text sentenceList = new Text();
		Pattern rt = Pattern.compile(TextManager.getProperty().getProperty("regex.REGEX_SENTENCE"));
		Matcher matcher = rt.matcher(paragraph);
		String sentence = new String();
		while (matcher.find()) {
			sentence = matcher.group();

			sentenceList.addElement(parseToWord(sentence));
			sentenceList.setIndex(TextElement.SENTENCE);
		}

		return sentenceList;

	}

	private Text parseToWord(String sentence) {
		Text wordSignList = new Text();
		Pattern rt = Pattern.compile(TextManager.getProperty().getProperty("regex.REGEX_WORD_AND_SIGN"));
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

		return wordSignList;
	}

}
