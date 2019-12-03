package days.day08.lambda.basicexample;

import java.util.Comparator;

public class BasicComparatorExample {

	static String a = "abcdefgh";
	static String b = "ijklmnop";
	
	
	public static void main(String[] args) {

		Comparator<String> comparatorObject = new Comparator<String>() {

			public int compare(String s1, String s2) {

				return Integer.compare(s1.length(), s2.length());

			}

		};
		
		// somehow use this comparator object to do great things...
		comparatorObject.compare(a, b);
	}

}
