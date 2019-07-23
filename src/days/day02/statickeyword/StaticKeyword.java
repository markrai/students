package days.day02.statickeyword;

public class StaticKeyword {

	static int counter;  // Hey Guys! static variables belong to the class variable.
	int blahBlahBlah;
	
	void countNumberOfInstances() {
		
		counter++;			
		
	//	above line is the same as: counter = counter + 1;

	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		StaticKeyword.counter = counter;
	}

}
