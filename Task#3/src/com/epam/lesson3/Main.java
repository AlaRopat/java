package com.epam.lesson3;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
public static void main(String[]args) {
	ReadWithScanner f=new ReadWithScanner("D://workjava/task2_text.txt");
	
	f.processByLine();
	

}
}
