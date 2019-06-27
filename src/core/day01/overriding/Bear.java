package core.day01.overriding;

public class Bear extends Animal {

	public void walk() {

		System.out.println("I'm a bear and I walk on all four legs!");
	}

	public void sampleMethod() {

		Bear b = new Bear();
		b.eat(); // This "eat()" method was inherited from the animal class.

	}

}
