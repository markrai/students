package days.day02.accessmodifiers2;

import days.day02.accessmodifiers1.AccessModifiers;

public class CheckAccess3 extends AccessModifiers {

	public static void main(String[] args) {

		AccessModifiers am = new AccessModifiers();
		am.variable1 = "This works";
	//  am.variable2 = default - same package / will not show up here..
    //am.variable3 = "protected - should work... but isn't";
    // am.protectedMethod(); - isn't working?
	// am.variable4 = "private - obviously will not work.	

	}

}
