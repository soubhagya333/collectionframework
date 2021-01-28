package com.xworkz.cosmetics;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.cosmetics.constants.CosmeticShades;
import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dao.CosmeticDAO;
import com.xworkz.cosmetics.dao.CosmeticDAOImpl;
import com.xworkz.cosmetics.dto.CosmeticDTO;
import com.xworkz.cosmetics.services.CosmeticService;
import com.xworkz.cosmetics.services.CosmeticServiceImpl;

public class ValidationTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	CosmeticDAO dao =new CosmeticDAOImpl();
		
		CosmeticDTO cosmeticDTO =new CosmeticDTO();
		cosmeticDTO.setBrand("MAC");
		cosmeticDTO.setType(CosmeticType.lipstick);
		cosmeticDTO.setShades(CosmeticShades.plum);
		cosmeticDTO.setPrice(1000);
		cosmeticDTO.setQuantity(40);
	//	dao.save(null);

		List<CosmeticDTO> list = new LinkedList<CosmeticDTO>();
		CosmeticDAOImpl dao =new CosmeticDAOImpl(list);
		
		
		CosmeticService service =new CosmeticServiceImpl();
		service.validDataAndSave(cosmeticDTO);
		
       //   System.out.println(dao.totalSize());
	}

}
