package com.xworkz.book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.book.dao.BookDAO;
import com.xworkz.book.dao.BookDAOImpl;
import com.xworkz.book.dto.BookDTO;

public class BookTester {

	public static void main(String[] args) {
		//BookDAO dao = new BookDAOImpl();
		BookDTO bookDTO = new BookDTO();

		bookDTO.setName("vidya");
		bookDTO.setPrice(30.00);
		bookDTO.setNoOfPages(300);
		BookDTO bookDTO1 = new BookDTO("classmate", 40.00, 100.00);
		BookDTO bookDTO2 = new BookDTO("guru", 50.00, 300.00);

		List<BookDTO> bookDTOs = new ArrayList();
		bookDTOs.add(bookDTO);
		bookDTOs.add(bookDTO1);
		bookDTOs.add(bookDTO2);

		for (BookDTO bookDTO3 : bookDTOs) {
			System.out.println(bookDTO3.getName());

		}
//Collections.sort(bookDTOs);
//		for (BookDTO bookDTO3 : bookDTOs) {
//			System.out.println(bookDTO3.getName());

		}

	}


