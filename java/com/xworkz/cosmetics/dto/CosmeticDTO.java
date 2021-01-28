package com.xworkz.cosmetics.dto;

import com.xworkz.cosmetics.constants.CosmeticShades;
import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.services.Shades;

public class CosmeticDTO {
	public class getShades {

	}

	private String brand;
	private static CosmeticShades shades;
	private CosmeticType type;
	private double price;
	private int quantity;

	
	public CosmeticDTO() {
		super();
		this.brand = brand;
		this.shades = shades;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public static CosmeticShades getShades() {
		return shades;
	}

	public void setShades(CosmeticShades shades) {
		this.shades = shades;
	}

	public CosmeticType getType() {
		return type;
	}

	public void setType(CosmeticType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price2) {
		this.price = price2;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CosmeticDTO [brand=" + brand + ", shades=" + shades + ", type=" + type + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
	}
		
			if (obj instanceof CosmeticDTO) {
				CosmeticDTO dto = (CosmeticDTO) obj;
				if(this.brand!=null && this.type!=null) {
					if(this.brand.equals(dto.getBrand())&& this.type==dto.getType()) {
				System.out.println("brand and type is matching"+ dto);
				return true;
			}
		}
			}
		System.out.println("brand and type are not equal");
		return false;
	}

	}


