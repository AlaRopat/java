package com.epam.lesson3;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		TextParse f = new TextParse();

		String text = f.readFile("D://workjava/task2_text.txt");
		TextElement tr = f.parseToText(text);
		

	}
}
