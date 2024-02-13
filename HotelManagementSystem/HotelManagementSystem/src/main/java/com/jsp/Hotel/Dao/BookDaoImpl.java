package com.jsp.Hotel.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.Hotel.Entity.BookInformation;
import com.jsp.Hotel.Entity.PaymentInformation;
import com.jsp.Hotel.Repository.BookRepository;
@Component
public class BookDaoImpl implements BookDao {
@Autowired
private BookRepository bookRepository;
	@Override
	public BookInformation getBookDetails(BookInformation bookInformation) {
		return bookRepository.save(bookInformation);
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<BookInformation> getAllBook() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}
	


}
