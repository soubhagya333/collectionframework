package com.xworkz.license.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dao.LicenseDAO;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseDAOImpl implements LicenseDAO{

	private List<LicenseDTO> database;
	
	
	public LicenseDAOImpl() {
		this.database=new ArrayList<LicenseDTO>();
		
	}
	
	public void save(LicenseDTO dto) {
System.out.println("invoked save in license dao imps");
		System.out.println("dto to save"+ dto);
		boolean saved = this.database.add(dto);
		if(saved)
			System.out.println("dto saved");
		else
			System.out.println("not");
	}

	public LicenseDTO findByIdProofNo(String idProofNo) {
     System.out.println("invoked findByIdProofNo ");
		System.out.println("idProofNo:"+idProofNo);	
		
		for(LicenseDTO licenseDTO : this.database) {
			String idProfFromDTO= licenseDTO.getIdProofNo();
			if(idProfFromDTO.equals(idProofNo)) {
				System.out.println("license found");
				return licenseDTO;
				
			}
		}
		return null;
	}
	
	public boolean updateVehicleTypeIdProofNo(String idProof ,VehicleType type) {
		System.out.println("invoked  updateVehicleTypeIdProofNo");
		System.out.println("idProof:" + idProof );
		System.out.println("type:"+ type);
		LicenseDTO dtoFromDB=this.findByIdProofNo(idProof);
		if(dtoFromDB !=null) {
			System.out.println("can update ,license is found");
			dtoFromDB.setVehicleType(type);
			return true;
		}
		else {
			System.out.println("cant update ,license not found");
		}
	
		return false;

	}
	public boolean deleteByIdProofNo(String idProof) {
		return false;

	}

	@Override
	public boolean updateVehicleTypeByIdProofNo(String idProof, VehicleType type) {
		// TODO Auto-generated method stub
		return false;
	}

}
