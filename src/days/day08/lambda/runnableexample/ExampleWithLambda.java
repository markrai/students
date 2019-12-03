package days.day08.lambda.runnableexample;

public class ExampleWithLambda {

	public static void main(String[] args) {
		
		Runnable r  = () -> {
			int i = 0;
			while (i++ < 10) {
				
				System.out.println("it works!");
			}
		};
		
	}
}
