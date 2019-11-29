package days.day03.booleanlogicaloperators;

public class Tests {

	static Integer a = 1;
	static Integer b = null;
	static Integer c = 3;
	static Integer d = 4;

	public static void main(String[] args) {

		// 1
		if (c == 3 & d == 4) {

			System.out.println("if.1: Both conditions are true!");
		} else {

			System.out.println("if.1 is false!");
		}

		// 2
		if (a == 3 && b == 2) {

			System.out.println("if.2: was true!");
		}

		else {

			System.out.println("if.2 was false");
		}

		int x = 0;
		String result1 = (x == 0 ? "x is zero" : "x is not zero");
		int result2 = (x == 0 ? x + 1 : x - 1);
		
		System.out.println(result1);
		System.out.println(result2);


	}

}
