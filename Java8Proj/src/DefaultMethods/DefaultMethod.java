package DefaultMethods;

//Sayable is a functional interface that contains a default and an abstract method. 
//The concept of default method is used to define a method with default implementation. 
//You can override default method also to provide more specific implementation for the method.

interface Sayable {
	// Default method
	default void say() {
		System.out.println("Hello, this is default method");
	}

	// Abstract method
	void sayMore(String msg);
}

public class DefaultMethod implements Sayable {
	public void sayMore(String msg) { // implementing abstract method
		System.out.println(msg);
	}

	public static void main(String[] args) {
		DefaultMethod dm = new DefaultMethod();
		dm.say(); // calling default method
		dm.sayMore("Work is worship"); // calling abstract method

	}
}