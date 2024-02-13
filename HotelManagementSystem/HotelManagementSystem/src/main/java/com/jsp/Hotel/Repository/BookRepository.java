package com.jsp.Hotel.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Hotel.Entity.BookInformation;
import com.jsp.Hotel.Entity.PaymentInformation;

public interface BookRepository extends JpaRepository<BookInformation, Integer>{

}
