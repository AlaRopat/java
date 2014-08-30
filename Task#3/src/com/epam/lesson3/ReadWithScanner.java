package com.epam.lesson3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadWithScanner {
	private String filePath;
	Text t=new Text();

	public ReadWithScanner(String fileName) {
		this.filePath = fileName;
	}

	public void processByLine() {
		try {
			FileReader fr = new FileReader(filePath);
			Scanner scanner = new Scanner(fr);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.err.println(e);
		}
	

	}
}
