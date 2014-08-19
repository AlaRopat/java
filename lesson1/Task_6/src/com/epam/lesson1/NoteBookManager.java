package com.epam.lesson1;
/**
 * Класс для управления записями.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class NoteBookManager {
	/**
	 * Добавить новый объект в список.
	 * 
	 * @param ArrayList<Note>
	 */
	 public void addNote(Note n1,ArrayList <Note> notes){

			notes.add(n1);
		}
	 /**
	  * Удалить объект из списка.
	  *
	  * Выполняется поиск объекта в списке по дате.Затем этот объект
	  *  удаляется из списка
	  *  @param ArrayList<Note>
	  *  @param String date
	  *  Дата нужной записи.
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
		 * Просмотреть все элементы списка.
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
		 * Редактирование записи.
		 * 
		 * @param ArrayList<Note>
		 * @param String  newNote
		 * Строка с изменнениями.
		 * @param int index
		 * Индекс записи, которую нужно изменить.
		 */
		public void editNote(ArrayList<Note> notes,
				String newNote,int index){
			notes.get(index).setNotation(newNote);
			}
		/**
		 * Поиск записи в списке.
		 * 
		 * @param ArrayList<Note>
		 *  @param String date
		 *  Дата нужной записи.
		 *  @return индекс найденного элемента
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
