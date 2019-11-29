package days.day03.wrapperclasses;

import java.util.ArrayList;

/* auto-boxing & auto-unboxing
 * 
 * Java's Wrapper classes:
 * 
 * Character - char
 * Byte      - byte
 * Short     - short
 * Integer   - int
 * Float     - float
 * Double    - double
 * Boolean   - boolean
 * 
 * Question: Why isn't String in this list?
 */


public class WrapperClasses {

	public void myMethod() {

		int i = 5;
		int j = 6;

		Integer integer1 = new Integer(i); // Boxing

		Integer integer2 = i; // Auto-boxing

		j = integer1.intValue(); // Unboxing

		i = integer2; // Auto unboxing

		// When is autoboxing used?

		ArrayList<Integer> values = new ArrayList<>();
		values.add(5);
		values.add(7);
	//	values.add("Ali");    // will only take ints!
		
		int placeHolder = values.get(0);
		

	}
}
