package core.day5.hashcodeandequals.overriddenexample;

import java.util.HashSet;

public class HashcodeEquals {

	public static void main(String[] args) {

		Student alex1 = new Student(1, "Alex");
		Student alex2 = new Student(1, "Alex");

		HashSet<Student> students = new HashSet<Student>();

		students.add(alex1);
		students.add(alex2);

		System.out.println("HashSet size = " + students.size());
		System.out.println("HashSet contains Alex = " + students.contains(new Student(1, "Alex")));
	}
	
	
}