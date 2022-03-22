package com.nse.shoppingcart;

public class Item {
	
	public int id;
	public String description;
	public int quantity;
	public double price;
	
	public void printItemDetails(){
		System.out.println(id);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(price);
	}

}
