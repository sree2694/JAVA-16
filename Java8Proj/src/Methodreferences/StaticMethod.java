package Methodreferences;

interface Sayable {
//	we have defined a functional interface and referring a static method to it's functional method say().
	void say();
}

public class StaticMethod {
	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}

	public static void main(String[] args) {
		// Referring static method
		Sayable sayable = StaticMethod::saySomething;
		// Calling interface method
		sayable.say();
	}
}