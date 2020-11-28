package com.sal.models;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	
	@NotBlank
	@Column(name = "BOOK_IMAGE")
	private String bookImage;
	
	@NotBlank
	@Column(name = "BOOK_TITLE")
	private String bookTitle;
	
	@NotBlank
	@Column(name = "BOOK_NAME")
	private String bookName;
	
	@NotBlank
	@Column(name = "AUDIO_VOICE")
	private String voice;
	
	@NotBlank
	@Column(name = "BOOK_AUTHOR_NAME")
	private String authorName;
	
	@NotBlank
	@Column(name = "TOTAL_AUDIO")
	private String totalAudio;
	
	@NotBlank
	@Column(name = "BOOK_PDF")
	private String bookPdf;
	
	@NotBlank
	@Column(name = "CREATED_AT")
	private LocalTime createdAt;
	

	@ManyToOne
	private BookLanguage languageId;

}
