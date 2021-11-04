package Streams;

import java.util.*;

class Product4 {
	int id;
	String name;
	float price;

	public Product4(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class Count {
	public static void main(String[] args) {
		List<Product4> productsList = new ArrayList<Product4>();
		// Adding Products
		productsList.add(new Product4(1, "HP Laptop", 25000f));
		productsList.add(new Product4(2, "Dell Laptop", 30000f));
		productsList.add(new Product4(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product4(4, "Sony Laptop", 28000f));
		productsList.add(new Product4(5, "Apple Laptop", 90000f));
		// count number of products based on the filter
		long count = productsList.stream().filter(product -> product.price < 30000).count();
		System.out.println(count);
	}
}

//stream allows you to collect your result in any various forms. 
//You can get you result as set, list or map and can perform manipulation on the elements.