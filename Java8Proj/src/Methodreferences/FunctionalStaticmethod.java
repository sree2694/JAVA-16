package Methodreferences;

//we are using predefined functional interface Runnable to refer static method.
public class FunctionalStaticmethod {
	public static void ThreadStatus() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		Thread t2 = new Thread(FunctionalStaticmethod::ThreadStatus);
		t2.start();
	}
}