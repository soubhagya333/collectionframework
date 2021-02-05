package com.xworkz.book.service;

import java.util.List;

import com.xworkz.book.dto.BookDTO;


public interface BookServiceDAO {

	boolean validDataAndSave(BookDTO name);
	boolean deleteByName(String name);
	
	public List<BookDTO> getAll();	
}
