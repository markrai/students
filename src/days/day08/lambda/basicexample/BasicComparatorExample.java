package days.day08.lambda.basicexample;

import java.util.Comparator;

public class BasicComparatorExample {

	static String a = "abcdefgh";
	static String b = "ijklmnopa";

	public static void main(String[] args) {

		Comparator<String> comparatorObject = new Comparator<String>() {

			public int compare(String s1, String s2) {

				System.out.println(Integer.compare(s1.length(), s2.length()));
				
				return Integer.compare(s1.length(), s2.length());

			}

		};

		// use this comparator object to do something with it.
		//someMethod(data, comparatorObject);

	}

}
