package com.xworkz.book.dao;

import java.util.List;

import com.xworkz.book.dto.BookDTO;

public interface BookDAO {
   
	boolean save(BookDTO name);
	boolean deleteByName(String name);
	public List<BookDTO> getAll();
	boolean updatePrice(double price);
	
}
