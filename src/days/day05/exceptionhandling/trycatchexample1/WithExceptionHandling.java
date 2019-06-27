package days.day05.exceptionhandling.trycatchexample1;

public class WithExceptionHandling {

	public static void main(String args[]) {
		int d = 0;
		int n = 20;

		try {
			int fraction = n / d; // risky statement
			System.out.println("This line will not be Executed");

		}

		catch (ArithmeticException e) {
			System.out.println("In the catch Block due to Exception: " + e);
		}

		System.out.println("Program Completed"); // program resumes because exception was caught/dealt with.
	}
}