// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);

		int a = (int)(Math.random() * lim);
		int b = (int)(Math.random() * lim);
		int c = (int)(Math.random() * lim);

	System.out.println(a + " " + b + " " + c);
		
	int minNumberAB = Math.min(a, b); // Minimum of a and b
	int minNumber = Math.min(minNumberAB, c); // Minimum of all three

	int maxNumberAB = Math.max(a, b); // Maximum of a and b
	int maxNumber = Math.max(maxNumberAB, c); // Maximum of all three

	int averageNumber = (a + b + c) - (minNumber + maxNumber); 
	// Example: a=2, b=5, c=3; 2+5+3=10;
	// min=2; max=5; average=10-(2+5)=3

		System.out.println(minNumber + " " + averageNumber + " " + maxNumber);
	}
}
