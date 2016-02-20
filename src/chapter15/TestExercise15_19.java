package chapter15;

import java.util.Scanner;

/**
 * This is the test class for the Exercise15_19.
 * 
 * @author Ashish
 *
 */
public class TestExercise15_19 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); // Creates Scanner to input real
		// and imaginary part of the
		// complex number.

		System.out.print("Enter the first complex number: ");
		Exercise15_19 complex1 = new Exercise15_19(input.nextDouble(), input.nextDouble()); // Input
		// and
		// stores
		// values
		// of
		// first
		// complex
		// number.
		System.out.print("Enter the second complex number: ");
		Exercise15_19 complex2 = new Exercise15_19(input.nextDouble(), input.nextDouble()); // Input
		// and
		// stores
		// values
		// of
		// second
		// complex
		// number.
		System.out.print("(" + complex1.toString() + ")" + "+" + "(" + complex2.toString() + ")" + " = ");
		System.out.println((complex1.add(complex2)) + "i"); // Add complex1 and
		// complex2.
		System.out.print("(" + complex1.toString() + ")" + "-" + "(" + complex2.toString() + ")" + " = ");
		System.out.println(complex1.subtract(complex2) + "i"); // Subtract
		// complex1 and
		// complex2.
		System.out.print("(" + complex1.toString() + ")" + "*" + "(" + complex2.toString() + ")" + " = ");
		System.out.println(complex1.multiply(complex2) + "i"); // Multiply
		// complex1 and
		// complex2.
		System.out.print("(" + complex1.toString() + ")" + "/" + "(" + complex2.toString() + ")" + " = ");
		System.out.println(complex1.divide(complex2) + "i"); // Divide complex1
		// and complex2.
		System.out.print("|( " + complex1.getRealPart() + " + " + complex2.getImaginaryPart() + "i )| = ");
		System.out.println(complex1.abs()); // Returns the absolute value of the
		// complex number.
	}

}
