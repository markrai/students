package days.day05.hashcodeandequals.simpleexample;

public class Man {

	int geneticCode;

//	public boolean equals(Man man) {
//		return this.geneticCode == man.geneticCode;
//	} // This will not work in all situations. hashCode() also needs to be overridden.

	public static void main(String[] args) {

		Man man1 = new Man();
		man1.geneticCode = 1111222233;

		Man man2 = new Man();
		man2.geneticCode = 1111222233;

		System.out.println(man1 == man2);
		System.out.println(man1.equals(man2)); 
	}
}
