package days.day08.lambda.methodreferences;

import java.util.function.Consumer;

public class MethodReferenceExample {

	public static void main(String[] args) {

		//this can be re-written
		Consumer<String> c = s -> System.out.println(s);
		
		//like this, instead...
		Consumer<String> d = System.out::println;

	}

}


/* method references are used to replace a single-method lambda expression.
 * So to use a method reference, you first need a lambda expression with one method. 
 * And to use a lambda expression, you first need a functional interface, an interface 
 * with just one abstract method.
 * 
 * In other words:
 * 
 * Instead of using AN ANONYMOUS CLASS
 * you can use A LAMBDA EXPRESSION
 * And if this just calls one method, you can use
 * A METHOD REFERENCE
 * 
 */
