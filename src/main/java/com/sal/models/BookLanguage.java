package com.sal.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BookLanguage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int languageId;

	@Column(name = "Book_Language")
	private String language;

	@Column(name = "COUNT")
	private String count;
	
	public BookLanguage(int languageId, String language, String count, List<Books> books) {
		super();
		this.languageId = languageId;
		this.language = language;
		this.count = count;
		this.books = books;
	}

	@OneToMany(mappedBy = "bookId",fetch = FetchType.LAZY)
	private List<Books> books;

	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}



	public BookLanguage() {
		super();
	}

	public int getBookId() {
		return languageId;
	}

	public void setBookId(int bookId) {
		this.languageId = bookId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
