package Streams;

//We can also use collectors to compute sum of numeric values. 
//We are using Collectors class and it?s specified methods to compute sum of all the product prices.

import java.util.*;
import java.util.stream.Collectors;

class Product2 {
	int id;
	String name;
	float price;

	public Product2(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class ComputeSum {
	public static void main(String[] args) {
		List<Product2> productsList = new ArrayList<Product2>();
		// Adding Products
		productsList.add(new Product2(1, "HP Laptop", 25000f));
		productsList.add(new Product2(2, "Dell Laptop", 30000f));
		productsList.add(new Product2(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product2(4, "Sony Laptop", 28000f));
		productsList.add(new Product2(5, "Apple Laptop", 90000f));
		// Using Collectors's method to sum the prices.
		double totalPrice3 = productsList.stream().collect(Collectors.summingDouble(product -> product.price));
		System.out.println(totalPrice3);

	}
}