package days.day02.statickeyword;

public class RunThis {

	public static void main(String[] args) {

		System.out.println("Hey! I am inside the main method!");
		StaticKeywordOmletteExample skoe = new StaticKeywordOmletteExample();
		StaticKeywordOmletteExample skoe2 = new StaticKeywordOmletteExample();

	}

	public void myMethod() { // NON STATIC METHOD

		StaticKeywordOmletteExample sk2 = new StaticKeywordOmletteExample();

		System.out.println(StaticKeywordOmletteExample.getCounter());

	}

}
