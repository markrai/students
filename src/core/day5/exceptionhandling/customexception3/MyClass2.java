package core.day5.exceptionhandling.customexception3;

public class MyClass2 {

	public void myMethod2() throws MyCustomException {

		int a = 1;
		int b = 0;
		int c = 0;

		if (b == 0) {

			throw new MyCustomException("Exception Occurred", "b cannot be zero!");
		}

		System.out.println("Exception was thrown, but program continues ;)");

	}

}
