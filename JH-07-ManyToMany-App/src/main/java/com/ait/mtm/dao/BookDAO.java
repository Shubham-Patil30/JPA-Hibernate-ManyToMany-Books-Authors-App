package com.ait.mtm.dao;

import com.ait.mtm.entities.Book;

public interface BookDAO {

	public void saveBook(Book book) ; 
	
	public Book fetchBookById(Integer bookId); 
	
	public void removeBook(Integer bookId); 
}
