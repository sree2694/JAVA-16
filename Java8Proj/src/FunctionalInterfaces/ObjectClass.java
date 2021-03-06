package FunctionalInterfaces;

//A functional interface can have methods of object class. 

@FunctionalInterface
interface sayable1 {
	void say(String msg); // abstract method
	// It can contain any number of Object class methods.

	int hashCode();

	String toString();

	boolean equals(Object obj);
}

public class ObjectClass implements sayable1 {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		ObjectClass fie = new ObjectClass();
		fie.say("Hello there");
	}
}