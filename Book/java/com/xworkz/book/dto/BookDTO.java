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
		super();
		this.name = name;
		this.price = price;
		this.noOfPages = noOfPages;
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
	
	

}
