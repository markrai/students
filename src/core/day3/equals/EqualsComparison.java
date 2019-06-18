package core.day3.equals;

public class EqualsComparison {

	boolean result;

	private static String s1 = new String("Dell");
	private static String s2 = new String("Dell");
	
	Object o = new Object();

	public boolean checkIfEquals() {

		result = (s1 == s2) ? true : false;
		System.out.println(result);            // false! 
		                                      // == compares object references, not object properties

		result = (s1.equals(s2)) ? true : false;
		System.out.println(result);           // true!
											 //  equals compares "contents" (or however it is defined)
		return result;

		
		o.equals(obj)
	}

}
