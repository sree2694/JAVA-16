package LambdaExp;

//if there is only one statement, you may or may not use return keyword. 
//You must use return keyword when lambda expression contains multiple statements.
interface Addable1 {
	int add(int a, int b);
}

public class ReturnKey {
	public static void main(String[] args) {

		// Lambda expression without return keyword.
		Addable1 ad1 = (a, b) -> (a + b);
		System.out.println(ad1.add(10, 20));

		// Lambda expression with return keyword.
		Addable1 ad2 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(ad2.add(100, 200));
	}
}