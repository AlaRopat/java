package com.epam.lesson1;

import java.util.ArrayList;


public class Main {
public static void main(String[]args){
	ArrayList <Note> notes=new ArrayList<Note>();
	
	Note n1=new Note();
	Note n2=new Note();
	Note n3=new Note();
	
	
	n1.setNotation("Old Yellow Bricks");
	n1.setDate("5.08.2012");
	
	
	n2.setNotation(" Do I Wanna Know?");
	n2.setDate("24.07.2013");
	
	
	n3.setNotation(" Fluorescent Adolescent");
	n3.setDate("25.07.2013");
	
	
	
	NoteBook sd=new NoteBook();
	sd.setNotes(notes);
	sd.getNotes();
	
	NoteBookManager tr= new NoteBookManager();
	tr.addNote(n1, notes);
	tr.addNote(n2, notes);
	tr.addNote(n3, notes);
	
	
    tr.showNotes(notes);
   int i= tr.findNote(notes,"25.07.2013");
   tr.editNote(notes, " Fluorescent Adolescent!!!!!!!!!", i);
   tr.showNotes(notes);
   tr.deleteNote("25.07.2013", notes);
   tr.showNotes(notes);
	}
}

