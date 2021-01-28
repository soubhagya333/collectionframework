package com.xworkz.license.dto;

public class AddressDTO {
	
	private int doorNo;
	private String street;
	private int pinCode;
	private String area;
	private String city;
	private String state;
	private String buildingName;
	
	public AddressDTO() {
	}

	public AddressDTO(int doorNo, String street, int pinCode, String area, String city, String state,
			String buildingName) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.pinCode = pinCode;
		this.area = area;
		this.city = city;
		this.state = state;
		this.buildingName = buildingName;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
        	
}
