package com.xworkz.book;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.book.dao.BookDAO;
import com.xworkz.book.dao.BookDAOImpl;
import com.xworkz.book.dto.BookDTO;
import com.xworkz.book.service.BookServiceDAO;
import com.xworkz.book.service.BookServiceDAOImpl;

public class ValidationTester {

	public static void main(String[] args) {

		 BookDAO dao=new BookDAOImpl();
		 
   
		BookDTO bookDTO = new BookDTO("vidya", 50.00, 200.00);

		BookDTO bookDTO1 = new BookDTO("classmates", 39.00, 100.00);

		BookDTO bookDT2 = new BookDTO("guru", 56.00, 300.00);
		
		dao.save(bookDTO);
		dao.deleteByName("guru");
		

		List<BookDTO> list = new LinkedList<BookDTO>();
		BookDAOImpl dao1= new BookDAOImpl();

		BookServiceDAO service = new BookServiceDAOImpl();
		service.validDataAndSave(bookDTO);

	}
}
