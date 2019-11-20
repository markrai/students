package days.day02.accessmodifiers1;

public class AccessModifiers {

	public String variable1; // any class in the project can see it
	       String variable2; // only same package
	protected String variable3; // only sub/child classes or same package
	private String variable4; // only the class has access
	
	protected void protectedMethod() {
		
		// this method has "protected" visibility.
	}

}
