package com.xworkz.book.service;

import com.xworkz.book.dto.BookDTO;


public interface BookServiceDAO {

	boolean validDataAndSave(BookDTO name);
	
}
