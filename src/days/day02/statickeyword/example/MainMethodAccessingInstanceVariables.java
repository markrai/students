package days.day02.statickeyword.example;

public class MainMethodAccessingInstanceVariables {

	int var1 = 100;
	int var2 = 200;
	static int var3 = 300;

	public static void main(String[] args) {

		// System.out.println(var1); <--- static method cannot access instance variable!
		System.out.println(var3);

	}

}
