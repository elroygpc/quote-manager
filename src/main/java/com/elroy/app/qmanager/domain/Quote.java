package com.elroy.app.qmanager.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quote")
public class Quote {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="quote_id")
	private Long id;
	@Column(name="quote_text")
	private String text;
	private String author;
	
	
	public Quote() {
		super();
	}

	public Quote(String text, String author) {
		super();
		this.text = text;
		this.author = author;
	}

	public Quote(Long id, String text, String author) {
		super();
		this.id = id;
		this.text = text;
		this.author = author;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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

	@Override
	public String toString() {
		return String.format(
                "Quote[id=%d, text='%s', author='%s']",
                id, text, author);
	}
	
	
	
//	private Source source;
//	private List<String> categories;
//	
//	static class Source {
//		String value;
//		enum Type {
//			AUTHOR, BOOK
//		}
//	}
//
//	public Quote(String text, Source source, List<String> categories) {
//		super();
//		this.text = text;
//		this.source = source;
//		this.categories = categories;
//	}
//
//	public Quote(String text, Source source) {
//		this(text, source, null);
//	}
//
//	public String getText() {
//		return text;
//	}
//
//	public void setText(String text) {
//		this.text = text;
//	}
//
//	public Source getSource() {
//		return source;
//	}
//
//	public void setSource(Source source) {
//		this.source = source;
//	}
//
//	public List<String> getCategories() {
//		return categories;
//	}
//
//	public void setCategories(List<String> categories) {
//		this.categories = categories;
//	}
//
//	@Override
//	public String toString() {
//		return "Quote [text=" + text + ", source=" + source + ", categories=" + categories + "]";
//	}
	
}
