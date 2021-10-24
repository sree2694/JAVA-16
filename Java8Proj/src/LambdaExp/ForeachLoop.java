package LambdaExp;

import java.util.*;

public class ForeachLoop {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("mango");
		list.add("icecream");
		list.add("jackfruit");

		list.forEach((n) -> System.out.println(n));
	}
}