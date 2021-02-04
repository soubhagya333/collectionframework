package com.xworkz.book.dao;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.book.dto.BookDTO;
public class BookDAOImpl implements BookDAO {

	//private static final Object type = null;
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
	}


