package days.day08.AnonymousClass;

//anonymous classes allow you to declare and instantiate a class at the same time.
// See line #25. These classes have no name.

class X {

	public void show() {
		System.out.println("Inside the X class's show()");
	}

}

/*
 * We get rid of this class entirely
 * 
 *class B {
 * 
 * public void show() {
 * 
 * System.out.println("Inside the B class's show()"); } }
 */

public class UsecaseWithAnonymousClass {
	
	public static void main(String[] args) {

		X obj = new X() {

		};

	}

}
