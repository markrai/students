package days.day02.finalkeyword;

public final class FinalKeyword  { // a final class cannot be sub-classed! (i.e. extended)

	final int myFinalVariable = 5; // this variable will be a constant.

	int myInstanceVariable = 10;

	public final void myMethod() { // final methods cannot be overridden in sub-classes.

		// myFinalVariable = 6; <-- this value cannot be set again

		myInstanceVariable = 50;

	}

}


