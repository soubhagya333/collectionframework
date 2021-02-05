package com.xworkz.book.dao;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.book.dto.BookDTO;

public class BookDAOImpl implements BookDAO {

	private List<BookDTO> books;

	public BookDAOImpl() {
		this.books = new ArrayList<BookDTO>();
		System.out.println("Created BookDAOImpl");
	}

	public boolean save(BookDTO name) {
		boolean added = false;
		boolean contains = this.books.contains(name);
		if (!contains) {
			added = this.books.add(name);
		}
		if (added)
			System.out.println("book are added");
		else
			System.out.println(" book not added");
		return added;
	}

	@Override
	public boolean deleteByName(String name) {
		System.out.println("invoked deleteByName");
		for (BookDTO bookDTO : books) {
			if (name != null && bookDTO.getName().equals(name)) {
				System.out.println("Found the name with the given name,deleting the name: ");
				this.books.remove(bookDTO);
				System.out.println("size of given name after delete" + "  " + name);
				System.out.println(this.books.size());
				return true;
			}
		}
		return false;
	}

public List<BookDTO> getAll() {

	System.out.println("invoked getAll");
	return this.books;
}
//
//@Override
//public boolean updatePrice(double price) {
//
//		System.out.println("invoked updatePrice");
//		for (BookDTO bookDTO : books) {
//			if(price != null   && bookDTO.getPrice().equals(price)
//					&& bookDTO.getPrice().equals(price)) {
//				if(price !=null && bookDTO.getPrice().)
//			System.out.println("found the cosmetic with the given type and name ,updating the price");
//			bookDTO.setPrice(price);
//			System.out.println("Thw DTO after updating the price");
//			System.out.println(bookDTO);
//			return true;
//		}
//	}
//	
//	
//	return false;
//}
//}

@Override
public boolean updatePrice(double price) {
	// TODO Auto-generated method stub
	return false;
}
}
