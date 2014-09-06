package com.epam.lesson3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.epam.lesson3.entity.Text;
import com.epam.lesson3.entity.TextElement;
import com.epam.lesson3.logic.parse.TextParse;
import com.epam.lesson3.manager.FileManager;
import com.epam.lesson3.manager.TextManager;

public class Main {
	public static void main(String[] args) {
		TextParse f = new TextParse();

		String text = FileManager.readFile("task2_text.txt");
		Text wholeText = new Text();
		TextElement tr = f.parseToText(wholeText, text);

//		String txt = TextManager.buildText(tr);
//		System.out.println(txt);
		TextElement	rt=TextManager.replaceWord(tr, 2,11);
		
//rt.print();
	}
}