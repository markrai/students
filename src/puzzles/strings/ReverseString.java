package puzzles.strings;

public class ReverseString {

	static String input1 = "Hello World";
	static String input2 = "Hello World";

	// with StringBuilder
	public void withStringBuilder(String input1) {

		StringBuilder sb1 = new StringBuilder(input1);
		System.out.println(sb1.reverse().toString());
	}

	
	// using StringBuilder only to store mutable String
	public void withoutStringBuilder(String input2) {

		StringBuilder sb2 = new StringBuilder();
		
		for (int i = sb2.length() - 1; i >= 0; i--) {
			sb2.append(input2.charAt(i));
		}

		System.out.println(sb2.toString());
	}

	public static void main(String[] args) {

		ReverseString r = new ReverseString();

		System.out.print("Using String Builder's reverse() method: ");
		r.withStringBuilder(input1);
		
		System.out.print("Using String Builder only to store the String: ");
		r.withoutStringBuilder(input2);

	}

}
