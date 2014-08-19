package com.epam.lesson1;
/**
 * ����� ��� ���������� ��������.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class NoteBookManager {
	/**
	 * �������� ����� ������ � ������.
	 * 
	 * @param ArrayList<Note>
	 */
	 public void addNote(Note n1,ArrayList <Note> notes){

			notes.add(n1);
		}
	 /**
	  * ������� ������ �� ������.
	  *
	  * ����������� ����� ������� � ������ �� ����.����� ���� ������
	  *  ��������� �� ������
	  *  @param ArrayList<Note>
	  *  @param String date
	  *  ���� ������ ������.
	 	  */
		public void deleteNote(String date,ArrayList <Note> notes){
			Iterator<Note> it=notes.iterator();
			while(it.hasNext()){
				if(	it.next().getDate().equals(date)){
					it.remove();
				}
			}
		}
		/**
		 * ����������� ��� �������� ������.
		 * 
		 *  @param ArrayList<Note>
		 */
		public void showNotes(ArrayList<Note> notes){
			Iterator<Note> it=notes.iterator();
			while(it.hasNext()){
				System.out.println(it.next().getNotation());
			}
			System.out.println("\n");
			}
		/**
		 * �������������� ������.
		 * 
		 * @param ArrayList<Note>
		 * @param String  newNote
		 * ������ � ������������.
		 * @param int index
		 * ������ ������, ������� ����� ��������.
		 */
		public void editNote(ArrayList<Note> notes,
				String newNote,int index){
			notes.get(index).setNotation(newNote);
			}
		/**
		 * ����� ������ � ������.
		 * 
		 * @param ArrayList<Note>
		 *  @param String date
		 *  ���� ������ ������.
		 *  @return ������ ���������� ��������
		 */
		public int findNote(ArrayList<Note> notes,String date){
			int index=0;
		for(int i=0;i<notes.size();i++){
			if(notes.get(i).getDate().equals(date)){
				index=i;
			}
		}
		
		return index;
}
		}
