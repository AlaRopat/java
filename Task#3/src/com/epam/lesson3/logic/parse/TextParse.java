package com.epam.lesson3.logic.parse;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.epam.lesson3.entity.Text;
import com.epam.lesson3.entity.TextElement;
import com.epam.lesson3.entity.TextItem;

public class TextParse {
	public static final String REGEX_BLOCK_OF_CODE = "(\n(class|void)(.+[^}]\\s)+(}\n)+)";
	public static final String REGEX_SENTENCE = "([^\\.\\?!:;]*)([\\.\\?!:;])([\\s\n]*)";
	public static final String REGEX_WORD_AND_SIGN = "([A-Za-z\\'\\-]+)|(\\s)|([\\p{Punct}^\\'^\\-])|([\\d]+)";

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
		Text codeList = new Text();
		Pattern rt = Pattern.compile(REGEX_BLOCK_OF_CODE);
		String paragraph = new String();
		String code=new String();
		String[] te = rt.split(text);
		Matcher matcher = rt.matcher(text);
		
		for (int i = 0; i < te.length; i++) {
			paragraph = te[i];
			textList.addElement(new TextItem(paragraph, TextElement.TEXT));
			if(matcher.find()){
			code=matcher.group();
			codeList.addElement(new TextItem(code,TextElement.CODE));
		}
		}
		
		
	
		/*
		 * for(int i=0;i<textList.size();i++){
		 * System.out.println(textList.get(i)); }
		 */
wholeText.addElement(textList);
wholeText.addElement(codeList);
textList = parseToSentence(textList, paragraph);
		return wholeText;

	}

	private Text parseToSentence(Text textList, String paragraph) {
		Text sentenceList = new Text();
		Pattern rt = Pattern.compile(REGEX_SENTENCE);
		Matcher matcher = rt.matcher(paragraph);
		String sentence = new String();
		while (matcher.find()) {
			sentence = matcher.group();
		
		
			
			sentenceList
					.addElement(new TextItem(sentence, TextElement.SENTENCE));

			textList.addElement(sentenceList);
		
		}
	sentenceList = parseToWord(sentenceList, sentence);
		return textList;

	}

	@SuppressWarnings("static-access")
	private Text parseToWord(Text sentenceList, String sentence) {
		Text wordSignList = new Text();
		Pattern rt = Pattern.compile(REGEX_WORD_AND_SIGN);
		Matcher matcher = rt.matcher(sentence);
		String wordSign = new String();
		String word = new String();
		String sign = new String();
		String space = new String();
		String number = new String();
		while (matcher.find()) {
			wordSign = matcher.group();
			if (rt.matches(REGEX_WORD_AND_SIGN, wordSign)) {
				word = matcher.group(1);
				wordSignList.addElement(new TextItem(word, TextElement.WORD));
			}
			if (rt.matches(REGEX_WORD_AND_SIGN, wordSign)) {
				sign = matcher.group(3);
				wordSignList.addElement(new TextItem(sign, TextElement.SIGN));
			}
			if (rt.matches(REGEX_WORD_AND_SIGN, wordSign)) {
				space = matcher.group(2);
				wordSignList.addElement(new TextItem(space, TextElement.SPACE));
			}
			if (rt.matches(REGEX_WORD_AND_SIGN, wordSign)) {
				number = matcher.group(4);
				wordSignList.addElement(new TextItem(number, TextElement.NUMBER));
			}
			sentenceList.addElement(wordSignList);

		}

		return sentenceList;
	}

	/*
	 * private Text parseToPunctuation(Text wordList, String word) { Text
	 * wordSignList = new Text(); Pattern rt = Pattern.compile(); Matcher
	 * matcher = rt.matcher(word); String word=new String(); return null; }
	 */
}
