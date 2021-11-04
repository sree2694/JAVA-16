package DefaultMethods;

//You can also define static methods inside the interface. 
//Static methods are used to define utility methods. 
//The following example explain, how to implement static method in interface?

interface Sayable1 {
	// default method
	default void say() {
		System.out.println("Hello, this is default method");
	}

	// Abstract method
	void sayMore(String msg);

	// static method
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}

public class DefaultMethods implements Sayable1 {
	public void sayMore(String msg) { // implementing abstract method
		System.out.println(msg);
	}

	public static void main(String[] args) {
		DefaultMethods dm = new DefaultMethods();
		dm.say(); // calling default method
		dm.sayMore("Work is worship"); // calling abstract method
		Sayable1.sayLouder("Helloooo..."); // calling static method
	}
}