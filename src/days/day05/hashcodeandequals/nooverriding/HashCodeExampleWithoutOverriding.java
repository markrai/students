package days.day05.hashcodeandequals.nooverriding;

public class HashCodeExampleWithoutOverriding {

	public static void main(String[] args) {

		Person s1 = new Person(1, "Billy");
		Person s2 = new Person(2, "Vishal");
		Person s3 = new Person(3, "Deepika");
		Person s4 = new Person(1, "Billy");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());


	}

}
