package com.nse.shoppingcart;

public class ShoppingCart {

	public static void main(String[] args) {

		Item obj1 = new Item();
		Item obj2 = new Item();
		
		obj1.description = "shirt";
		obj2.description = "pants";
		
		obj1.quantity = 3;
		obj2.quantity = 5;
		
		obj1.price = 500;
		obj2.price = 700;
		
		obj1.printItemDetails();
		obj2.printItemDetails();

	}

}
