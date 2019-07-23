package days.day02.statickeyword;

public class RunThis {
	
	
	public static void main(String[] args) {     // IS STATIC
		
		System.out.println("Hey! I am inside the main method!");			
		StaticKeyword sk = new StaticKeyword();		
		sk.countNumberOfInstances();
		
		StaticKeyword sk2 = new StaticKeyword();
		sk.countNumberOfInstances();
		
		System.out.println(sk.getCounter());
		
	}
	
	
	public void myMethod() {   // NOT STATIC
		
		StaticKeyword sk2 = new StaticKeyword();
		
		
	}

}
