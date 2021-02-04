package com.xworkz.book;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.book.dao.BookDAO;
import com.xworkz.book.dao.BookDAOImpl;
import com.xworkz.book.dto.BookDTO;

public class BookTester {

	public static void main(String[] args) {
		BookDAO dao = new BookDAOImpl();
		BookDTO bookDTO =new BookDTO("vidya", 40.00, 100.00);
		BookDTO bookDTO1 =new BookDTO("classmate", 50.00, 300.00);
		

		List<BookDTO> bookDTOs = new ArrayList<BookDTO>();
		bookDTOs.add(bookDTO);
		bookDTOs.add(bookDTO1);
		
		for (BookDTO bookDTO2 : bookDTOs) {
			System.out.println(bookDTO2.getName());
			
		}
	
	}

}
