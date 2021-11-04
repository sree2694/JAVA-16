package Streams;

//You can use stream to iterate any number of times. 
//Stream provides predefined methods to deal with the logic you implement. 
//We are iterating, filtering and passed a limit to fix the iteration.

import java.util.stream.*;

public class Iteration {
	public static void main(String[] args) {
		Stream.iterate(1, element -> element + 1).filter(element -> element % 5 == 0).limit(5)
				.forEach(System.out::println);
	}
}