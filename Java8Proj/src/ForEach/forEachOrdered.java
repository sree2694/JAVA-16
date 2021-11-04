package ForEach;

//Along with forEach() method, Java provides one more method forEachOrdered(). 

//It is used to iterate elements in the order specified by the stream.

import java.util.ArrayList;
import java.util.List;

public class forEachOrdered {
	public static void main(String[] args) {
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hocky");
		System.out.println("------------Iterating by passing lambda expression---------------");
		gamesList.stream().forEachOrdered(games -> System.out.println(games));
		System.out.println("------------Iterating by passing method reference---------------");
		gamesList.stream().forEachOrdered(System.out::println);
	}

}