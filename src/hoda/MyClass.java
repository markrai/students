package hoda;

import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		double var1;
		double var2;
		double fibNumber = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number greater than zero:");
		int nth = input.nextInt();
		// part1 ------------------print out nth Fibonacci number
		System.out.println("---------------------------------------");
		if (nth == 1) {
			fibNumber = 0;
		} else if (nth == 2) {
			fibNumber = 1;
		} else {
			var1 = 0;
			var2 = 1;
			for (int i = 3; i <= nth; i++) {
				fibNumber = var1 + var2;
				var1 = var2;
				var2 = fibNumber;
			}
		}
		System.out.println("The " + nth + "th Fibonacci number is: " + fibNumber);
		// part2 ------------------print all Fibonacci from first to nth
		System.out.println("---------------------------------------");
		System.out.println("All Fibonacci numbers from first to " + nth + "th are: ");
		var1 = 0;
		System.out.print(var1);
		var2 = 1;
		System.out.print(", " + var2);
		for (int i = 3; i <= nth; i++) {
			fibNumber = var1 + var2;
			System.out.print(", " + fibNumber);
			var1 = var2;
			var2 = fibNumber;
		}
		// part3 -------------------tell whether nth is a Fibonacci number?
		System.out.printf("--------------------------------------- %n");
		if (nth == 0) {
			System.out.println(" 0 is the first Fibonacci number.");
		} else if (nth == 1) {
			System.out.println(" 1 is the second and third Fibonacci number.");
		} else {
			var1 = 1;
			var2 = 1;
			int fibIndex = 3;
			boolean isFibonacci = false;
			do {
				fibIndex++;
				fibNumber = var1 + var2;
				var1 = var2;
				var2 = fibNumber;
				// System.out.println("***" + nth + isFibonacci + fibIndex + fibNumber + var2 +
				// var1);
				if (fibNumber == nth) {
					isFibonacci = true;
					break;
				}
			} while (fibNumber <= nth);
			if (isFibonacci == true) {
				System.out.println(nth + " Is the " + fibIndex + "th Fibonacci number.");
			} else {
				System.out.println(nth + "%n Is not a Fibonacci number.");
			}
		}
	}
}