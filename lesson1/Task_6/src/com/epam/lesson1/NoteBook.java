package com.epam.lesson1;
/**
 * Класс для хранения записей.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class NoteBook {
	private  ArrayList <Note> notes=new ArrayList<Note>();
	public ArrayList<Note> getNotes(){

		return (notes);
	}
	public void setNotes(ArrayList <Note> notes){
		this.notes=notes;
	}
		
		
	


}

