package core.day3.ternary;

/* Ternary Operator
 * 
 *   (condition) ? if true expression : if false expression
 */

public class Ternary {

	boolean result;

	int a = 10;
	int b = 20;

	public void checkIfEquals() {

		System.out.println(result);
		String result = (a > b) ? "a is greater " : "b is greater";
                     //condition    //if true       // if false
	}

}
