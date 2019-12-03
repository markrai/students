/* Lambda expressions allow us to have "functions as objects." 
 * 
 */

package days.day08.lambda.basicexample;

import java.util.Comparator;

/* On line 19, we are creating an object of type Comparator<String>
 * the arrow operator on line 21 is similar (but not equivalent) to creating an anonymous class.
 * On line 21, the parameters are declared to the left of the ->
 * On the right side of -> the expression to be returned.
 * String s1, String s2 is implied on line 21.
 */

public class LambdaComparatorExample {
	
	public static void main(String[] args) {
		
		Comparator<String> comparator = 
				(s1, s2) -> Integer.compare(s1.length(), s2.length());
		
				
				
	}

}




/*
* Comparator<String> comparator = new Comparator<String>() {
*
*			public int compare(String s1, String s2) {
*				
*				return Integer.compare(s1.length(), s2.length());
*
*  This is how we were doing it before.
*
*
*
*/
