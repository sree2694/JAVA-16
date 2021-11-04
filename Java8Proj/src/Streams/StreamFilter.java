package Streams;

//Java stream provides a method filter() to filter stream elements on the basis of given predicate. 
//Suppose you want to get only even elements of your list then you can do this easily with the help of filter method.
//
//This method takes predicate as an argument and returns a stream of consisting of resulted elements.

import java.util.*;

class Products1 {
	int id;
	String name;
	float price;

	public Products1(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class StreamFilter {
	public static void main(String[] args) {
		List<Products1> productsList = new ArrayList<Products1>();
		// Adding Products
		productsList.add(new Products1(1, "HP Laptop", 25000f));
		productsList.add(new Products1(2, "Dell Laptop", 30000f));
		productsList.add(new Products1(3, "Lenevo Laptop", 28000f));
		productsList.add(new Products1(4, "Sony Laptop", 28000f));
		productsList.add(new Products1(5, "Apple Laptop", 90000f));
		productsList.stream().filter(p -> p.price > 30000) // filtering price
				.map(pm -> pm.price) // fetching price
				.forEach(System.out::println); // iterating price
	}
}