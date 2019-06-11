package core.day1; // package declaration

public class ExampleClass {

	// This is the "body" of the class

	private int myNumber; // instance variable
	static private int counter; // class variable

	
	public int walk(int numberOfSteps) { // method which takes one parameter and returns an 'int'
		System.out.println("I just walked" + numberOfSteps + "steps!");
		return numberOfSteps;
	}
	
	
	public String talk(int numberOfWords) {
		String speech = null;
		System.out.println("I am speaking "+ numberOfWords + " words");		
		return speech;
	}
	
	
	public void eat() {  // This method has a void return type, so it returns nothing. 
		
		// eat!
	}

}

/*
 * Members of a class
 *
 * instance variables: when the class gets instantiated (i.e. when an instance
 * (or object) is created of that class, instance variables are part of this new
 * object.
 * 
 * class variables: these variables only belong to the Class. They are NOT part
 * of the objects which are instantiated.
 *
 */