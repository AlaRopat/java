package com.epam.lesson3.manager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.epam.lesson3.entity.Text;
import com.epam.lesson3.entity.TextElement;

public class TextManager {
	public static String buildText(Text text) {
		StringBuilder sb = new StringBuilder();
		Iterator iterator = text.createrIterator();
		while(iterator.hasNext()){
			TextElement element=(TextElement)iterator.next();
			try{
			sb.append(element.getContent());
			}catch(UnsupportedOperationException e){
				
			}
		}
		return sb.toString();
		

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
