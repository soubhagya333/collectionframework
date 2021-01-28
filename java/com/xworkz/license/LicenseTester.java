package com.xworkz.license;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.IdProof;
import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dao.LicenseDAO;
import com.xworkz.license.dao.impl.LicenseDAOImpl;
import com.xworkz.license.dto.AddressDTO;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseTester {

	public static void main(String[] args) {
	
		AddressDTO addressDTO =new AddressDTO();
		Date dob = new Date();
		SimpleDateFormat format =new SimpleDateFormat("dd/mm/yyyy");
		try {
			dob=format.parse("16/10/1996");
			
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		
		LicenseDTO dto = new LicenseDTO("soubhagya",23,addressDTO,dob,8884923476l,BloodGroup.AB_POSITIVE,Gender.FEMALE);
		dto.setIdProof(IdProof.ADHARCARD);
		dto.setIdProofNo("6464 8787 6449");
		dto.setCommercial(false);
		dto.setDisablity(false);
		dto.setStartdate(new Date());
		dto.setVehicleType(VehicleType.TWO_WHEELERS);
		
		LicenseDAO dao =new LicenseDAOImpl();
		dao.save(dto);
		
		LicenseDTO dtoFound =dao.findByIdProofNo("6464 8787 6449");
	System.out.println(dtoFound);
		
	boolean updated= dao.updateVehicleTypeByIdProofNo("6464 8787 6449", VehicleType.LMV);
	System.out.println("updated"+updated);
	
		LicenseDTO dtoafterUpdate=dao.findByIdProofNo("6464 8787 6449");
		System.out.println(dtoafterUpdate);
		
	}

}
