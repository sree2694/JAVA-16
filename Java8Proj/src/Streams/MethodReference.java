package Streams;

import java.util.*;  
import java.util.stream.Collectors;  
  
class Product7{  
    int id;  
    String name;  
    float price;  
      
    public Product7(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
          
    public int getId() {  
        return id;  
    }  
    public String getName() {  
        return name;  
    }  
    public float getPrice() {  
        return price;  
    }  
}  
  
public class MethodReference {  
  
    public static void main(String[] args) {  
          
        List<Product7> productsList = new ArrayList<Product7>();  
          
        //Adding Products  
        productsList.add(new Product7(1,"HP Laptop",25000f));  
        productsList.add(new Product7(2,"Dell Laptop",30000f));  
        productsList.add(new Product7(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product7(4,"Sony Laptop",28000f));  
        productsList.add(new Product7(5,"Apple Laptop",90000f));  
          
        List<Float> productPriceList =   
                productsList.stream()  
                            .filter(p -> p.price > 30000) // filtering data  
                            .map(Product7::getPrice)         // fetching price by referring getPrice method  
                            .collect(Collectors.toList());  // collecting as list  
        System.out.println(productPriceList);  
    }  
}  