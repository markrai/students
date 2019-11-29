package days.day01.overriding;

public class Fish extends Animal{
	
	
	public void eat(int amountOfFood) {   // This is an overridden method.

		System.out.println("I'm a fish and I'm eating "+amountOfFood+" pellets of food!!!");
				
	}
	
}

/* even though the Fish class inherits the eat() method from Animal class
 * we are overriding it here and having it accept a parameter.
 */
