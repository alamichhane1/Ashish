package chapter10;

/**
 * This class is designed to check if the number is even, odd or prime. It also
 * checks if the content of Exercise10_03 is even, odd or prime respectively.
 * Similarly, this class also checks to see if two numbers are equal or not as
 * well as also checks to see if the contents of two objects are same or not.
 * Finally, this class also converts an array of characters into its integer
 * value and eventually, also converts the String into integer.
 * 
 * @version 1.00 24 Jan 2016 * @author Ashish Lamichhane
 */

public class Exercise10_03 {

	int value; // Create a variable to store integer value.

	public Exercise10_03(int value) {
		this.value = value; // assign the value of "value" parameter to the this.value.
	}

	/* getter method to get the value. */
	public int getInteger() {
		return value;
	}

	/*
	 * Method to return true if the number is even
	 */

	public boolean isEven() {
		return isEven(this.value);
	}

	/*
	 * Method to return true if the number is odd.
	 */
	public boolean isOdd() {
		return isOdd(this.value);
	}

	/*
	 * Method to return true if the number is prime.
	 */
	public boolean isPrime() {
		return isPrime(this.value);
	}

	/*
	 * Method to check if the provided number is even or not.
	 */
	public static boolean isEven(int number) {
		return number % 2 == 0 ; 
	}

	/*
	 * Method to check if the provided number is odd or not.
	 */
	public static boolean isOdd(int number) {
		return !isEven(number);
	}

	/*
	 * Method to check if the provided number is prime or not.
	 */
	public static boolean isPrime(int number) {
		boolean result = false ;
		if (number <= 1 ){
			result = false;
					
		}
		
		for (int i = 2; i <= number/2; i ++){
			if (number % i == 0 ) {
				result = false ;
			} else {
				 result = true;

			}
		}
		 return result ;
		}
	
	
	
	public static boolean isEven(Exercise10_03 number) {
		return number.isEven();
	}

	/*
	 * Method to check if the provided object is odd or not.
	 */
	public static boolean isOdd(Exercise10_03 number) {
		return number.isOdd();
	}

	/*
	 * Method to check if the provided object is prime or not.
	 */
	public static boolean isPrime(Exercise10_03 number) {
		return number.isPrime();
	}

	/*
	 * Method to check if the content of two numbers are equal.
	 */
	public boolean equals(int number) {
		boolean result = false; // Initially set the value to result to false.
		Integer newnumber = new Integer(number); // Create new Integer object.
		if (newnumber.equals(value)) { // Check if the contents of two numbers
										// are equal.
			result = true;
		}
		return result; // Return the result when the method is called.
	}

	/*
	 * Method to check if the contents to two Exercise10_03 object is same or
	 * not.
	 */
	public boolean equals(Exercise10_03 number) {
		return number.equals(this.value);
	}

	/*
	 * Method to convert the array, numchar, of an character into the integer.
	 */
	public static int parseInt(char[] numchar) {
		int result = 0; // Initialize the result to 0.
		for (int i = 0; i < numchar.length; i++) {
			/* Iterates the loop when it reaches the end of the array. */
			result = result * 10 + (numchar[i] - '0'); // Convert the char into
														// respective integer.
		}
		return result; // Return the result when the method is called.
	}

	/*
	 * Method to convert the String into its respective integer value.
	 */
	public static int parseInt(String a) {
		int result = 0; // Initiate the value of result to zero.
		try {
			result = Integer.parseInt(a.trim()); // Convert the string into
													// integer.
		} catch (NumberFormatException ex) {
			/* Throws an exception when user tries to enter non-integer number. */
			System.out.println("You've entered non-integer number");
			System.out.println("This caused " + ex);
		}

		return result; // Return the result when the method is called.

	}
}