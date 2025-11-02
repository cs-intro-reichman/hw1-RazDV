// Prints a given number using a hundreds, tens, and units notation.
// % java NumWords 517
// 5 hundreds, 1 tens, and 7 ones.
public class NumWords {
	public static void main(String args[]) {
		int number = Integer.parseInt(args[0]);

		int hundreds = number / 100; // Extract hundreds digit. Example: 517 / 100 = 5
		int tens = (number % 100) / 10; // Extract tens digit. Example: 517 % 100 = 17; 17 / 10 = 1
		int ones = number % 10; // Extract ones digit. Example: 517 % 10 = 7

		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
