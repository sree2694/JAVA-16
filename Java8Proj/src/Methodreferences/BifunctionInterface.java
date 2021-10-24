package Methodreferences;

//we are using BiFunction interface. 
//It is a predefined interface and contains a functional method apply(). 
//Here, we are referring add method to apply method.

import java.util.function.BiFunction;

class Arithmetic2 {
	public int add(int a, int b) {
		return a + b;
	}
}

public class BifunctionInterface {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = new Arithmetic2()::add;
		int result = adder.apply(10, 20);
		System.out.println(result);
	}
}