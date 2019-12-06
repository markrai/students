package days.day05.exceptionhandling.throwkeyword2;

public class MyClass {

	static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		} else {
			System.out.println("Access granted - You are old enough!");
		}
	}

	static void someMethod() throws ArithmeticException {

		checkAge(15);
	}

	static void anotherMethod() throws ArithmeticException {

		try {
			someMethod();

		} catch (ArithmeticException e) {

			System.out.println("Exception handled");
		}
	}

	public static void main(String[] args) {
		anotherMethod(); // Set age to 15 (which is below 18...)
	}

}

// Notes:
// The throw keyword cannot throw multiple exceptions
// throw is followed by an object.
// it is used inside a method.