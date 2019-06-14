package core.day3.loops;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoop {

	List<User> userList = new ArrayList<>();

	void createUsers() {

		User u1 = new User();
		u1.name = "John";
		
		User u2 = new User();
		u2.name = "Basit";
		
		User u3 = new User();
		u3.name = "Sara";

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
