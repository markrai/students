package puzzles.strings;
/* a note regarding Roman Numeral validation:
 * https://projecteuler.net/about=roman_numerals
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanToArabic {

	static int finalResult;

	public static void main(String[] args) {

		takeInput();

	}

	static int getBaseNumbers(char c) {

		char baseDigit = 0;

		if (c == 'O') {
			baseDigit = 0;
		}

		if (c == 'I') {
			baseDigit = 1;
		}

		if (c == 'V') {
			baseDigit = 5;
		}

		if (c == 'X') {
			baseDigit = 10;
		}

		if (c == 'L') {
			baseDigit = 50;
		}

		if (c == 'C') {
			baseDigit = 50;
		}

		if (c == 'D') {
			baseDigit = 50;
		}

		if (c == 'M') {
			baseDigit = 1000;
		}

		return baseDigit;
	}

	public static void takeInput() {

		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter Roman Numeral");
		String romanNumeral = s.nextLine();
		validate(romanNumeral);

	}

	static void validate(String str) {
		
		Pattern p = Pattern.compile("I{4,}|V{4,}|X{4,}|L{4,}|C{4,}|D{4,}|M{4,}");
		Matcher m = p.matcher(str);
		boolean b = m.matches();
		if (m.find()) {
			System.out.println("Invalid Input!");
			System.exit(0);
		}

		convert(str);

	}

	public static void convert(String romanNumeral) {

		// parse input and create ArrayList
		List<Integer> arabicNumeralIntList = new ArrayList<>();
		arabicNumeralIntList.add(0);
		for (int i = 0; i < romanNumeral.length(); i++) {
			arabicNumeralIntList.add(i + 1, getBaseNumbers(romanNumeral.charAt(i)));
		}
		arabicNumeralIntList.add(0);

		// if Roman numeral is single letter
		if (romanNumeral.length() == 1) {
			finalResult = arabicNumeralIntList.get(1);
			System.out.println(finalResult);
			return;
		}

		// 2+ letter Roman numeral conversion into Arabic numeral
		for (int i = 0; i < arabicNumeralIntList.size() - 1; i++) {

			if (arabicNumeralIntList.get(i) >= arabicNumeralIntList.get(i + 1)) {
				finalResult += arabicNumeralIntList.get(i);
			} else {
				finalResult -= arabicNumeralIntList.get(i);
			}

		}

		System.out.println(finalResult);
		return;

	}
}
