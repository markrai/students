package days.day03.math;

public class MathOperators {

	static int num1 = 10;
	static int num2 = 15;
	static int num3 = 30;

	static float num4 = 3;
	static float num5 = 2;
	static float num6 = 6.3552f;
	static float varA;

	public static void main(String[] args) {

		varA = num1 + num2;
		System.out.println(varA);

		varA = num2 - num1;
		System.out.println(varA);

		varA = num1 * num2;
		System.out.println(varA);

		varA = num4 / num5;
		System.out.println(varA); // will not show decimal

		varA = num4 % num5;
		System.out.println(varA);

		if (num4 < num5) {
			System.out.println("Yes! num4 is less than num5");

		} else {
			System.out.println("no! num4 is not less than num5");

		}

		if (!(num4 == num5)) {

			System.out.println(num4 + " is not equal to " + num5);

		}

		System.out.println("Num6: " + num6);
		System.out.println(Math.round(num6));

	}

}
