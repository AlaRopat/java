package com.epam.lesson3;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
public static void main(String[]args) {
	ReadWithScanner f=new ReadWithScanner("D://лекции/task2_text.txt");
	List<String> list=new ArrayList<String>();
	list=f.processByLine();
	Iterator<String> it=list.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}

}
}
