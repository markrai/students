package days.day02.accessmodifiers2;

import days.day02.accessmodifiers1.AccessModifiers;

public class CheckAccess2 {

	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();

		am.variable1 = "public - this works";
		// am.variable2 - default - it's in a different package!
		//am.variable3 - protected - will not work
		//am.variable4 - private... will not work.

	}

}
