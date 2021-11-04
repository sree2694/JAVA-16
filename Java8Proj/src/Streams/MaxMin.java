package Streams;

//finds min and max product price by using stream. 
//It provides convenient way to find values without using imperative approach.

import java.util.*;

class Product3 {
	int id;
	String name;
	float price;

	public Product3(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class MaxMin {
	public static void main(String[] args) {
		List<Product3> productsList = new ArrayList<Product3>();
		// Adding Products
		productsList.add(new Product3(1, "HP Laptop", 25000f));
		productsList.add(new Product3(2, "Dell Laptop", 30000f));
		productsList.add(new Product3(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product3(4, "Sony Laptop", 28000f));
		productsList.add(new Product3(5, "Apple Laptop", 90000f));
		// max() method to get max Product price
		Product3 productA = productsList.stream().max((product1, product2) -> product1.price > product2.price ? 1 : -1)
				.get();
		System.out.println(productA.price);
		// min() method to get min Product price
		Product3 productB = productsList.stream().min((product1, product2) -> product1.price > product2.price ? 1 : -1)
				.get();
		System.out.println(productB.price);

	}
}