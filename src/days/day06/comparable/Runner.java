package days.day06.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<>();
		laps.add(new Laptop("Dell", 16, 800));
		laps.add(new Laptop("Apple", 8, 1200));
		laps.add(new Laptop("Acer", 12, 700));

		Collections.sort(laps); // sort accepts only those things which are Comparable

		for (Laptop l : laps) {
			System.out.println(l);
		}
	}

}
