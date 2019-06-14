package core.day3.booleanlogicaloperators;

public class BooleanLogicalOperators {

	int a = 2;
	int b = 3;
	int c = 4;
	String n = null;
	int x = 0;

	void someMethod() {

		if ((a == 2) & (b == 3)) {
			System.out.println("Both are true!");
		} else {
			System.out.println("At least one is false...");
		}

		if ((a == 100) && (b == 3)) {
			System.out.println("The first one was false - Don't bother checking 2nd condition...");
		} else {
			// this else block will never run...
		}

		if ((a == 100) || (b == 3)) {
			System.out.println("If the first one is true, don't bother checking second");
		} else {
			// this block will never run...
		}

		// Exclusive OR (XOR) "This, or that, but not both!"
		if ((a == 100) ^ (b == 3)) {
			System.out.println("Returns true, if they are different.");
		} else {
			System.out.println("false if values are different.");
		}

	}

	// Ternary Operator
	String result1 = (x == 0 ? "x is zero" : "x is not zero");

	int result2 = (x == 0 ? x + 1 : x - 1);

}
