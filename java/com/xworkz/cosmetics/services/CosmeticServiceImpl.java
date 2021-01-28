package com.xworkz.cosmetics.services;

import com.xworkz.cosmetics.constants.CosmeticShades;
import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dao.CosmeticDAO;
import com.xworkz.cosmetics.dto.CosmeticDTO;
import com.xworkz.cosmetics.dto.CosmeticDTO.getShades;

public class CosmeticServiceImpl implements CosmeticService {

	public CosmeticServiceImpl() {
		System.out.println("Created!!!!");
	}

	public boolean validDataAndSave(CosmeticDTO cosmeticDTO) {
		boolean validData = false;
		if (cosmeticDTO != null) {
			System.out.println("dto is not null ");
			String brand = cosmeticDTO.getBrand();

			if (brand != null && brand.length() >= 3 && !brand.isEmpty() && !brand.contains(" ")) {
				System.out.println("brand is valid");
				validData = true;
			} else {
				System.out.println("brand is invalid");
				validData = false;
			}

			if (validData) {
				CosmeticType type = cosmeticDTO.getType();
				if (type != null) {
					System.out.println("type is valid");
					validData = true;
				} else {
					System.out.println(" type is invalid");
					validData = false;
				}
			}
			if (validData) {
				CosmeticShades shade = CosmeticDTO.getShades();
				if (shade != null) {
					System.out.println("shade is valid");
					validData = true;
				} else {
					System.out.println(" shade is invalid");
					validData = false;
				}
			}
			if (validData) {
				double price = cosmeticDTO.getPrice();
				if (price > 100) {
					System.out.println(" price is valid");
					validData = true;
				} else {
					System.out.println("price is invalid");
					validData = false;
				}
			}

			if (validData) {
				int quantity = cosmeticDTO.getQuantity();
				if (quantity > 0 && quantity <= 100) {
					System.out.println("quantity is valid");
					validData = true;
				} else {
					System.out.println("quantity is invalid");
					validData = false;
				}
			}
			if (validData) {
				System.out.println("data is valid,can invoke dao");
			}

		} else {
			System.out.println("null dto,and invalid data");
		}
		return false;
	}

	
	}

