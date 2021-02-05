package com.xworkz.book.service;

import java.util.List;

import com.xworkz.book.dto.BookDTO;


public class BookServiceDAOImpl implements BookServiceDAO{

	@Override
	public boolean validDataAndSave(BookDTO dto) {
	
			boolean validData = false;
			if (dto != null) {
				System.out.println("dto is not null ");
				String name = dto.getName();

				if (name != null && name.length() >= 3 && !name.isEmpty() && !name.contains(" ")) {
					System.out.println("name is valid");
					validData = true;
				} else {
					System.out.println("name is invalid");
					validData = false;
				}
		return false;
	}
			return validData;

	}

	@Override
	public List<BookDTO> getAll() {
		return null;
	}

	@Override
	public boolean deleteByName(String name) {
		System.out.println("invoked deleted  by name");
		if(name!=null && !name.isEmpty() && !name.contains("  ")&& name.length() >=3){
			System.out.println("brand is valid ,can delete"+ name);

		}
		else {
			System.out.println("invalid name");
		}
		return false;
	}
}
