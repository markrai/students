package days.day02.accessmodifiers1;

public class CheckingAccess {
	
	public static void main(String[] args) {
	
		AccessModifiers am = new AccessModifiers();
		
		am.variable1 = "public - this works";
		am.variable2 = "default - same package";
		am.variable3 = "protected - same package/subclass";
		
		// am.variable4 - this is private! 
		
	}
	
	

}
