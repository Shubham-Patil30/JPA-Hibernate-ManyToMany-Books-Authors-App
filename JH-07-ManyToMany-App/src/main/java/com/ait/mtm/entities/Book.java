package com.ait.mtm.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_books")
public class Book {
	
	@Id
	@Column(name="book_id")
	private Integer bookId; 
	
	@Column(name="book_name")
	private String bookName; 
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="tbl_books_authors",
		joinColumns = @JoinColumn(name="book_id_fk", referencedColumnName = "book_id"),
		inverseJoinColumns = @JoinColumn(name="author_id_fk",referencedColumnName = "author_id")
			)
	private List<Author> authors ;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	} 
	
}
