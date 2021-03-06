package Methodreferences;

//ou can also use predefined functional interface to refer methods.
//we are using BiFunction interface and using it's apply() method.

import java.util.function.BiFunction;

class Arithmetic {
	public static int add(int a, int b) {
		return a + b;
	}
}

public class BiFunctionalStaticmethod {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = Arithmetics::add;
		int result = adder.apply(10, 20);
		System.out.println(result);
	}
}