package com.epam.lesson3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.epam.lesson3.entity.Text;
import com.epam.lesson3.entity.TextElement;
import com.epam.lesson3.logic.parse.TextParse;
import com.epam.lesson3.manager.TextManager;


public class Main {
	public static void main(String[] args)  {
		TextParse f = new TextParse();

		String text = f.readFile("task2_text.txt");
		Text wholeText = new Text();
		TextElement tr = f.parseToText(wholeText, text);
		String txt = TextManager.buildText(wholeText);
	System.out.println(txt);
	}
}