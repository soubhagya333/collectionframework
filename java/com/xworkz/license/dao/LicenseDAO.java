package com.xworkz.license.dao;

import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dto.LicenseDTO;

public interface LicenseDAO {

	void save(LicenseDTO dto);
	
	LicenseDTO findByIdProofNo(String idProofNo);
	boolean updateVehicleTypeByIdProofNo(String idProof,VehicleType type);
	boolean deleteByIdProofNo(String idProof);
	
}
