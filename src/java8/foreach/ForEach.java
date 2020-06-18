package java8.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// an example of an internal iterator
		// in this case we are calling a function on an object
		numbers.forEach(new Consumer<Integer>() {
			public void accept(Integer value) {
			}
		});

		// However this can be re-written:

		numbers.forEach((Integer value) -> System.out.println(value));

	}
}
