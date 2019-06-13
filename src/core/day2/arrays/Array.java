package core.day2.arrays;

public class Array {

	int[] myArray = new int[6];

	void addToArray() {

		myArray[0] = 15;
		myArray[1] = 153;
		myArray[3] = 536; // at index # 3, assign the value 536
		myArray[5] = 8;
		myArray[4] = 10;
		myArray[2] = 10;
		
		System.out.println("Numbers to array added");
		

	}

	void returnValues() {

		for (int i = 0; i < myArray.length; i++) {

			System.out.println(myArray[i]);
		}

	}

}
