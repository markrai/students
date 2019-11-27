package days.day05.hashcodeandequals.overriddenexample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashcodeEquals {

	public static void main(String[] args) {

		Student alex1 = new Student(1, "Alex");
		Student alex2 = new Student(1, "Alex");
		
//		List<Student> studentsArrayList = new ArrayList<>();
		HashSet<Student> studentsHashSet = new HashSet<Student>();

		studentsHashSet.add(alex1);
		studentsHashSet.add(alex2);
		

		System.out.println("HashSet size = " + studentsHashSet.size());
		System.out.println("HashSet contains Alex = " + studentsHashSet.contains(new Student(1, "Alex")));
	}
	
	
}