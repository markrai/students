package core.day05.exceptionhandling.customexception3;

public class MyCallingClass1 {

	public static void main(String[] args) {

		MyClass2 mc2 = new MyClass2();

		try {
			
			mc2.myMethod2();

		} catch (MyCustomException e) {

			e.printStackTrace();
		}

	}

}
