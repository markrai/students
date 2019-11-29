package days.day06.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<>();
		laps.add(new Laptop("Lenovo", 12, 700));
		laps.add(new Laptop("Dell", 16, 800));
		laps.add(new Laptop("Apple", 8, 1200));
		laps.add(new Laptop("Acer", 12, 700));

		Collections.sort(laps, new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				if (o1.getPrice() > o2.getPrice()) {
					return 1;
				} else
					return -1;
			}
		});

		for (Laptop l : laps) {
			System.out.println(l);
		}

	}

}