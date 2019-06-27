package days.day03.wrapperclasses;

import java.util.ArrayList;

/* auto-boxing & auto-unboxing
 * 
 * Java's Wrapper classes:
 * 
 * Character
 * Byte
 * Short
 * Integer
 * Float
 * Double
 * Boolean
 * 
 * Question: Why isn't String in this list?
 */


public class WrapperClasses {

	public void myMethod() {

		int i = 5;
		int j = 6;

		Integer i2 = new Integer(i); // Boxing

		Integer i3 = i; // Auto-boxing

		j = i3.intValue(); // Unboxing

		i = i2; // Auto unboxing

		// When is auoboxing used?

		ArrayList<Integer> values = new ArrayList<>();
		values.add(5);
		values.add(7);
	//	values.add("Ali");    // will only take ints!
		
		int placeHolder = values.get(0);
		

	}
}
