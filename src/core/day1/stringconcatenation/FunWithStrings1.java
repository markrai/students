package core.day1.stringconcatenation;

public class FunWithStrings1 {

	static int aNumber = 2;
	static int bNumber = 5;
	static String strVariable = "Chocolates";

	public static void someMethod() {

		System.out.println(aNumber+bNumber);   // this will print "7" 
		System.out.println(aNumber+bNumber+strVariable); // this will print "7Chocolates"
		System.out.println(strVariable+aNumber+bNumber); // this will print "Chocolates25"
	}

	public static void main(String[] args) {
		someMethod();
	}
	
	// notice the unexpected behavior in line 13 of the code.. Hmmm.. What's happening is
	// that once the String Chocolates is concatenated with an int, it is treated like a 
	// String from there onwards.

}
