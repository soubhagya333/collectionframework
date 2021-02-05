package com.xworkz.book.dto;



public class BookDTO {
	private String name;
	private double price;
	private double noOfPages;
	/**
	 * @param name
	 * @param price
	 * @param noOfPages
	 */
	public BookDTO(String name, double price, double noOfPages) {
		
		this.name = name;
		this.price = price;
		this.noOfPages = noOfPages;
	}
	public BookDTO() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the noOfPages
	 */
	public double getNoOfPages() {
		return noOfPages;
	}
	/**
	 * @param noOfPages the noOfPages to set
	 */
	public void setNoOfPages(double noOfPages) {
		this.noOfPages = noOfPages;
	}
	@Override
	public String toString() {
		return "BookDTO [name=" + name + ", price=" + price + ", noOfPages=" + noOfPages + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + ", getNoOfPages()=" + getNoOfPages() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (obj == null) {
//			return false;
//	}
//		
//			if (obj instanceof BookDTO) {
//				BookDTO dto = (BookDTO) obj;
//		
//					if(this.name.equals(dto.getName())&& this.name==dto.getName()) {
//				System.out.println("price is matching"+ dto);
//				return true;
//			}
//		}
//			}
//		System.out.println(" update price");
//		return false;
//	}

}
