package FunctionalInterfaces;

//A functional interface is extending to a non-functional interface.

interface Doable {
	default void doIt() {
		System.out.println("Do it now");
	}
}

@FunctionalInterface
interface Sayable extends Doable {
	void say(String msg); // abstract method
}

public class FunctionToNonFunction implements Sayable {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionToNonFunction fie = new FunctionToNonFunction();
		fie.say("Hello there");
		fie.doIt();
	}
}