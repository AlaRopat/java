package com.epam.lesson3.manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class FileManager {
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
	public static Properties getProperty(){
		FileInputStream fis;
		Properties property=new Properties();
		try{
			fis=new FileInputStream("src/.properties");
			property.load(fis);
		}catch(IOException e){
			 System.out.println("File is not exist");
		}
		return property;
		
	}
}
