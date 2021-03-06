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

	// BookDAO dao=new BookDAOImpl();
		 
   BookDTO bookDTO =new BookDTO();
   bookDTO.setName("guru");
   bookDTO.setPrice(35);
   bookDTO.setNoOfPages(300);
   
		BookDTO bookDTO1 = new BookDTO("vidya", 50.00, 200.00);

		BookDTO bookDTO2 = new BookDTO("classmates", 39.00, 100.00);


		List<BookDTO> list = new LinkedList<BookDTO>();
		BookDAO dao= new BookDAOImpl();

		BookServiceDAO service = new BookServiceDAOImpl();
		service.validDataAndSave(bookDTO);
		BookDTO bookDTO3= new BookDTO("manasa", 50.00, 100.00);
		service.validDataAndSave(bookDTO);

       service.deleteByName("manasa");
       
       System.out.println(bookDTO.getName());
	}
}
