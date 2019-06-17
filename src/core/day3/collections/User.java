package core.day3.collections;

import java.util.ArrayList;
import java.util.List;

public class User {

	List<User> userList = new ArrayList<>();

	private String name;
	private String accoutNumber;
	private int id;

	public void createUsers() {

		User u1 = new User();
		u1.name = "Billy";

		User u2 = new User();
		u2.name = "Ali";
		u2.id = 3553;

		userList.add(u1);
		userList.add(u2);

	}

}
