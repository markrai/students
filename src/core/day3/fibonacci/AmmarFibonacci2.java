package core.day3.fibonacci;

public class AmmarFibonacci2 {

	static int x = 0;
	static int y = 1;
	static int z = 1;
	static int upTill = 100; // Fibonacci sequence wanted up until which number?

	public static void main(String[] args) {

		System.out.print(x + " "); // print out x

		while (z < upTill) {
			System.out.print(z);
			System.out.print(" ");
			z = x + y; // z is printed
			x = y; // y is assigned to x
			y = z; // z is assigned to y

		}
	}
}
