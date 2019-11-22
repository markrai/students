package days.day02.statickeyword;

public class StaticKeywordOmletteExample {

	static int counter; // Hey Guys! static variables belong to the class variable.
	int numberOfEggs;
	int amountOfSalt;
	int blahBlahBlah;

	// default constructor
	public StaticKeywordOmletteExample() {
		counter++;
		System.out.println(counter);
	}

	
	//getters & setters
	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		StaticKeywordOmletteExample.counter = counter;
	}

}
