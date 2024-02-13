package com.jsp.Hotel.Dao;

import java.util.List;

import com.jsp.Hotel.Entity.BookInformation;
import com.jsp.Hotel.Entity.PaymentInformation;

public interface BookDao {
//BookInformation getBookDetails(BookInformation bookInformation);

BookInformation getBookDetails(BookInformation bookInformation);
List<BookInformation> getAllBook();
}
