package core.day03.fibonacci;

public class IzmaFibonacci {

	/*
	 * Function that will print the fibonacci sequence up to that number The
	 * Fibbonaci returns the sum of the previous two numbers in the sequence. It
	 * starts with 0,1
	 */
	void Fib(int number) {
		int first = 0;
		int second = 1;
		int result;

		for (int i = 0; i < number; i++) {
			// Fibonacii number starts with value 0
			if (i == 0) {
				System.out.println(0);
			}
			// The second number is 1
			else if (i == 1) {
				System.out.println(1);
			} else {
				// The result is the sum of the previous two numbers
				result = first + second;
				System.out.println(result);

				// Update the previous values
				first = second;
				second = result;

			}
		}
	}

	public static void main(String[] args) {
		IzmaFibonacci f = new IzmaFibonacci();
		f.Fib(4);
		f.Fib(10);
	}

}
