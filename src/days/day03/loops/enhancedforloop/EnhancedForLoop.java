package days.day03.loops.enhancedforloop;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoop {

	 List<User> userList = new ArrayList<>();
	 
	 // Please create a List of Type "User" with the name: userList
	 // The instantiation of this List will be as an ArrayList 
	 

	List<Integer> integerList = new ArrayList<>();
	
	void createUsers() {

		User u1 = new User();
		
		u1.setId(5);
		u1.setName("John");

		User u2 = new User();
		u2.setName("Basit");

		User u3 = new User();
		u3.setName("Sara");

		userList.add(u1);
		userList.add(u2);
		userList.add(u3);

	}

	void accessUsers() {

		for (User u : userList) {

			if (u.name.equals("Sara")) {

				System.out.println("found her!");

			} else {

				System.out.println("could not find sara!");
			}

		}

	}

}
