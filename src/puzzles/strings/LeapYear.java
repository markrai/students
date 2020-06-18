package puzzles.strings;

public class LeapYear {

	static int year = 2016;

	public static void main(String[] args) {

		leapSwitch(1);

	}

	public static void leapSwitch(int switchcase) {

		switch (switchcase) {

		case 1: {
			if (year % 4 == 0) {
				leapSwitch(2);
			} else {
				leapSwitch(5);
			}
		}
			break;

		case 2: {
			if (year % 100 == 0) {
				leapSwitch(3);

			} else {
				leapSwitch(4);
			}
		}
			break;

		case 3: {
			if (year % 400 == 0) {
				leapSwitch(4);

			} else {
				leapSwitch(5);
			}
		}
			break;

		case 4: {
			System.out.println(year + " is a leap year!");
		}
			break;

		case 5: {
			System.out.println("Not a leap year...");
		}
			break;

		}
	}
}
