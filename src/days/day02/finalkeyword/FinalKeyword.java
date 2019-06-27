package days.day02.finalkeyword;

public final class FinalKeyword {    // a final class cannot be sub-classed! (i.e. extended)

	final int myFinalVariable = 5; // this variable will be a constant.
	
	public final void aFinalMethod(){ // final methods cannot be overridden in sub-classes.
				
		// myFinalVariable = 6;   <-- This is not allowed.  
		
	}
	
}
