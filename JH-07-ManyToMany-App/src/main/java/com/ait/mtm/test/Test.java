package com.ait.mtm.test;
import java.util.Arrays;
import java.util.List;
import com.ait.mtm.dao.BookDAO;
import com.ait.mtm.dao.impl.BookDAOImpl;
import com.ait.mtm.entities.Author;
import com.ait.mtm.entities.Book;

public class Test {

	public static void main(String[] args) {
		
		BookDAO dao  = new BookDAOImpl(); 
		/*
//		 Saving Book Details 1 // 
	
		Book b1 = new Book(); 
	    b1.setBookId(1);
		b1.setBookName("Java");
		
		Book b2 = new Book();
		b2.setBookId(2);
		b2.setBookName("Python");
	
	// ==== Creating Authors Details ==========
		Author a1 = new Author() ; 
		a1.setAuthorId(101);
		a1.setAuthorName("ram");
		//		
		Author a2 = new Author() ; 
		a2.setAuthorId(102);
		a2.setAuthorName("Sram");

		Author a3 = new Author() ; 
		a3.setAuthorId(103);
		a3.setAuthorName("prem");

		List<Author> lstOfAuthorsB1 = Arrays.asList(a1,a2); 

		List<Author> lstOfAuthorB2 = Arrays.asList(a1,a2,a3); 
	
		//======== Assinging authors to Book ==============
		b1.setAuthors(lstOfAuthorsB1);
		b2.setAuthors(lstOfAuthorB2);
//		
//		//========== Saving into the DB =============== 
		dao.saveBook(b1);
		dao.saveBook(b2);
		*/
		// =========== fetching book by id ==========
		
//		Book b1 = dao.fetchBookById(1);
//		System.out.println("Book name: "+b1.getBookName());
//		System.out.println("Book id: "+b1.getBookId());
//		
//		List<Author> ls = b1.getAuthors(); 
//		ls.forEach(System.out::println);
		
		
		//======= Removing a Book ============= 
		dao.removeBook(1);
	}

}
