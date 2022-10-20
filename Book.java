package com.exception.main;

public class Book {
	
	private int bookId;
	
	private String bookName;
	
	public Book() {
		
		super();		
	}
	

	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}


	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}

	

}
