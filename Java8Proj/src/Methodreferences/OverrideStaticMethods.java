package Methodreferences;

//You can also override static methods by referring methods. 
//we have defined and overloaded three add methods.

import java.util.function.BiFunction;

class Arithmetics {
	public static int add(int a, int b) {
		return a + b;
	}

	public static float add(int a, float b) {
		return a + b;
	}

	public static float add(float a, float b) {
		return a + b;
	}
}

public class OverrideStaticMethods {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder1 = Arithmetic::add;
		BiFunction<Integer, Float, Float> adder2 = Arithmetics::add;
		BiFunction<Float, Float, Float> adder3 = Arithmetics::add;
		int result1 = adder1.apply(10, 20);
		float result2 = adder2.apply(10, 20.0f);
		float result3 = adder3.apply(10.0f, 20.0f);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}