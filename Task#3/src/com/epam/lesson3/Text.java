package com.epam.lesson3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Text {
	ArrayList<String> text = new ArrayList<String>();
	ArrayList<String> sentences = new ArrayList<String>();
	ArrayList<String> code = new ArrayList<String>();
	ArrayList<String> punctuation = new ArrayList<String>();

	public List<String> getText() {
		return Collections.unmodifiableList(text);

	}

	public void setText(String text) {
		this.text.add(text);
	}

	public List<String> getSentences() {
		return Collections.unmodifiableList(sentences);

	}

	public void setSentence(String sentence) {
		this.sentences.add(sentence);
	}

	public void setSentences(ArrayList<String> sentences) {
		this.sentences.addAll(sentences);
	}

	public List<String> getCode() {
		return Collections.unmodifiableList(code);

	}

	public void setCode(String code) {
		this.sentences.add(code);
	}

	public List<String> getPunctuation() {
		return Collections.unmodifiableList(punctuation);

	}

	public void setPunctuation(String punctuation) {
		this.sentences.add(punctuation);
	}
}
