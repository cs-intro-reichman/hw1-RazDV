// Computes the future value of a saving investment.
// futureValue = currentValue ⋅ (1 + rate)^n
// currentValue, which is the invested sum, (not negative integer)
// The annual interest rate is assumed to be a percentage
// The number of years n is assumed to be a nonnegative integer.

// % java FVCalc 100 10 2
// After 2 years, $100 saved at 10.0% will yield $121

public class FVCalc {
	public static void main(String[] args){
		String currentValueString = args[0];
		String rateString = args[1];
		String nString = args[2];
		
		
		double rate = Double.parseDouble(rateString) / 100;
		double n = Double.parseDouble(nString);
		double currentValue = Double.parseDouble(currentValueString);

		double futureValue = currentValue * Math.pow((1 + rate), n);

		System.out.println("After " + (int) n + " years, $" + (int) currentValue + " saved at " + rate * 100 +
						   "% will yield $" + (int) futureValue);
		

	}
}