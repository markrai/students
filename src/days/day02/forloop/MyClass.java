package days.day02.forloop;

public class MyClass {

	public static void main(String[] args) {

		myMethod();

	}

	static void myMethod() {
		System.out.println("Starting method....");

		for (int i = 1; i < 10; i++) {

			System.out.println("I am inside the for loop!! :D");
			System.out.println("We are running for the " + i + "th time");

		}

	}

}
