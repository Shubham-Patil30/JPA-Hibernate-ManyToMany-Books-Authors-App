package com.ait.mtm.dao.impl;

import com.ait.mtm.dao.BookDAO;
import com.ait.mtm.entities.Book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class BookDAOImpl implements BookDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("test"); 

	@Override
	public void saveBook(Book book) {
		EntityManager em = factory.createEntityManager(); 
		EntityTransaction tx = em.getTransaction(); 
		tx.begin();
		try {
			
			em.merge(book); 
			tx.commit();
			System.out.println("Book and Authors are added in db ");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("Some error occurs");
			e.printStackTrace();
		}
		

		
	}

	@Override
	public Book fetchBookById(Integer bookId) {
		EntityManager em = factory.createEntityManager(); 
		
			Book  exstingBook = em.find(Book.class, bookId);
			if(exstingBook != null) {
				return exstingBook;
			}
			else {
				System.out.println("Book not found");
			}
			return null; 
	}

	@Override
	public void removeBook(Integer bookId) {
		EntityManager em = factory.createEntityManager(); 
		EntityTransaction tx = em.getTransaction(); 
		tx.begin();
		try {
			Book  exstingBook = em.find(Book.class, bookId);
			if(exstingBook != null) {
				em.remove(exstingBook);
				tx.commit();
				System.out.println("Book is removed");
			}
			else {
				System.out.println("Book not found");
			}
		} catch (Exception e) {
			tx.rollback();
			System.out.println("Some error occurs");
			e.printStackTrace();
		}
	}
}


