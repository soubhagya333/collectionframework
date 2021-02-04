package com.xworkz.book.dao;

import com.xworkz.book.dto.BookDTO;

public interface BookDAO {
   
	boolean save(BookDTO name);
	boolean deleteByName(String name);
}
