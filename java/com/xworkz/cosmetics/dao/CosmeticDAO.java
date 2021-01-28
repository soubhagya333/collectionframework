package com.xworkz.cosmetics.dao;

import java.util.List;

import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dto.CosmeticDTO;

public interface CosmeticDAO {
	
	boolean save(CosmeticDTO dto);
	
boolean updatePriceAndQuantityByBrand(double price,int quantity,String brand);

boolean updatePriceByBrandAndType(double price,String brand,CosmeticType type);
	
	boolean deleteByBrand(String brand);

	//void deleteAll();

List<CosmeticDTO> getAll();

	int totalSize();

	

	



}
