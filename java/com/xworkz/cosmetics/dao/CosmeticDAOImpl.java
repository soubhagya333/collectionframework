package com.xworkz.cosmetics.dao;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dto.CosmeticDTO;

public class CosmeticDAOImpl implements CosmeticDAO {
private static final Object CosmeticType = null;
private List<CosmeticDTO> cosmetics;
public CosmeticDAOImpl(List<CosmeticDTO> list) {
	this.cosmetics=list;
	System.out.println("Created CosmeticDAOImpl");
}
	

	public boolean save(CosmeticDTO dto) {
		boolean added = false;
		boolean contains = this.cosmetics.contains(dto);
		if (!contains) {
			added = this.cosmetics.add(dto);
		}
		if (added)
			System.out.println("cosmetic are added");
		else
			System.out.println("not added");
		return added;

	}

//	@Override
//	public void deleteAll() {
//		System.out.println("invoked deleteAll");
//   this.cosmetics.clear();		
//   System.out.println("Size of collectionafter deleting all elements"+ " "+ this.cosmetics.size());
//	}
	@Override
	public boolean deleteByBrand(String brand) {
		System.out.println("invoked deleteByBrand");
		for (CosmeticDTO cosmeticDTO : cosmetics) {
			if (brand != null && cosmeticDTO.getBrand().equals(brand)) {
				System.out.println("Found the cosmetic with the given brand,deleting the cosmetic: ");
				this.cosmetics.remove(cosmeticDTO);
				System.out.println("size of given collection after delete" + "  " + brand);
				System.out.println(this.cosmetics.size());
				return true;
			}
		}
		return false;
	}

	@Override
	public List<CosmeticDTO> getAll() {

		System.out.println("invoked getAll");
		return this.cosmetics;
	}

	@Override
	public int totalSize() {
		System.out.println("invoked totalSize");
		Object totalSize = null;
		if (totalSize != null) {
			System.out.println("size" + totalSize());

		} else {
			System.out.println("");
		}
		return this.cosmetics.size();
	}

	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand) {
		System.out.println("invoked updatePriceAndQuantityByBrand");
		for (CosmeticDTO cosmeticDTO : cosmetics) {
			if (brand != null && cosmeticDTO.getBrand().equals(brand)) {
				System.out.println("Found the brand ,updating the price the quantity:");
				cosmeticDTO.setPrice(price);
				cosmeticDTO.setQuantity(quantity);
				System.out.println("the DTO after updating ");
				System.out.println(cosmeticDTO);
				return true;
			}

		}
		System.out.println("The brand enterd is not available!!");
		return false;
	}

	@Override
	public boolean updatePriceByBrandAndType(double price, String brand, CosmeticType type) {
		System.out.println("invoked updatePriceByBrandAndType");
		for (CosmeticDTO cosmeticDTO : cosmetics) {
			if(brand != null && CosmeticType != null  && cosmeticDTO.getBrand().equals(brand)
					&& cosmeticDTO.getType().equals(CosmeticType)) {
			System.out.println("found the cosmetic with the given type and name ,updating the price");
			cosmeticDTO.setPrice(price);
			System.out.println("Thw DTO after updating the price");
			System.out.println(cosmeticDTO);
			return true;
		}
	}
		System.out.println("the cosmetic for enetred type and brand is not available");
	
		return false;
	}

}
