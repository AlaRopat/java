package com.epam.lesson3.logic.parse;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.epam.lesson3.entity.Text;
import com.epam.lesson3.entity.TextElement;
import com.epam.lesson3.entity.TextItem;

public class TextParse {
	public static final String REGEX_BLOCK_OF_TEXT = "";
	public static final String REGEX_BLOCK_OF_CODE = "(\n(class|void)(.+[^}]\\s)+(}\n)+)";

	public TextParse() {

	}

	public String readFile(String filePath) {
		String text = new String();
		try {
			FileReader fr=new FileReader(filePath);
			Scanner scan=new Scanner(fr);
			while(scan.hasNextLine()){
				text+=scan.nextLine();
				text+="\n";}

			
		} catch (FileNotFoundException e) {
			System.err.println(e);
		} 
		
		
		return text;

	}

	public TextElement parseToText(String text) {

		Text codeList = new Text();
		Pattern rt = Pattern.compile(REGEX_BLOCK_OF_CODE);
		String code = new String();
		Matcher matcher = rt.matcher(text);
		while (matcher.find()) {
			code =matcher.group();
			System.out.println(code);
			codeList.addElement(new TextItem(code));
		}

		return codeList;

	}
}
