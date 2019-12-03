package days.day08.lambda.runnableexample;

public class ExampleWithoutLambda {

	public static void main(String[] args) {

		Runnable r = new Runnable() { // anonymous class begin

			public void run() {

				int i = 0;
				while (i++ < 10) {

					System.out.println("It works!");
				}
			}
		}; // anonymous class end
	}
}
