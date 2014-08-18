package com.epam.lesson1;

/**
 * Класс для создания записей
 * 
 */
public class Note {
	private String notation;
	private String date;
	public Note(String mes,String date){
		this.notation=mes;
		this.date=date;
		
	}

	public String getNotation() {
		return notation;
	}

	public void setNotation(String notation) {
		this.notation = notation;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
