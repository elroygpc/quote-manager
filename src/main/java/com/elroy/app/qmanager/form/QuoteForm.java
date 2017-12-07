package com.elroy.app.qmanager.form;

import javax.validation.constraints.NotNull;

import com.elroy.app.qmanager.domain.Quote;

public class QuoteForm {

	@NotNull
	private String text;
	@NotNull
	private String author;

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Quote toQuote() {
		return new Quote(text, author);
	}
	
	@Override
	public String toString() {
		return String.format("Quote [text = '%s', author = '%s']", text, author);
	}
	
}
