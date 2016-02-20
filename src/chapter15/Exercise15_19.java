package chapter15;

/**
 * This class creates the complex number and performs the basic arithmetic
 * operation with two complex numbers. This class has methods to add, subtract,
 * multiply, divide complex numbers and also calculates the acutal numeric value
 * of the complex number.
 * 
 * @author Ashish Lamichhane
 *
 */

public class Exercise15_19 {
	private double a; // stores real part of the complex number.
	private double b; // stores imaginary part of the complex number.

	/** Default constructor. */
	public Exercise15_19() {
		this(0, 0);
	}

	/**
	 * Constructor that creates complex number with no imaginary part or
	 * imaginary part zero.
	 */
	public Exercise15_19(double a) {
		this(a, 0);
	}

	/**
	 * Constructor that requires user to input both real and imaginary part of
	 * the complex number.
	 */
	public Exercise15_19(double a, double b) {
		this.a = a;
		this.b = b;
	}

	/* Getter for real part. */
	public double getRealPart() {
		return this.a;
	}

	/* Getter for imaginary part */
	public double getImaginaryPart() {
		return this.b;
	}

	/* Method to add two complex number */
	public String add(Exercise15_19 o2) {
		return (this.getRealPart() + o2.getRealPart()) + " + " + (this.getImaginaryPart() + o2.getImaginaryPart());
	}

	/* Method to subtract two complex number */
	public String subtract(Exercise15_19 o2) {
		return (this.getRealPart() - o2.getRealPart()) + " + " + (this.getImaginaryPart() - o2.getImaginaryPart());
	}

	/* Method to multiply two complex number */
	public String multiply(Exercise15_19 o2) {
		return (this.getRealPart() * o2.getRealPart() - this.getImaginaryPart() * o2.getImaginaryPart()) + " + "
				+ (o2.getRealPart() * this.getImaginaryPart() + this.getRealPart() * o2.getImaginaryPart());
	}

	/* Method to divide two complex number */
	public String divide(Exercise15_19 o2) {
		double divisor = o2.getRealPart() * o2.getRealPart() + o2.getImaginaryPart() * o2.getImaginaryPart();
		double part1 = this.getRealPart() * o2.getRealPart() + this.getImaginaryPart() * o2.getImaginaryPart();
		double part2 = this.getImaginaryPart() * o2.getRealPart() - this.getRealPart() * o2.getImaginaryPart();
		return String.format("%.4f + %.1f", (part1 / divisor), (part2 / divisor));

	}

	/* Method to calculate the actual value of the complex number */
	public double abs() {
		return Math.sqrt(this.getRealPart() * this.getRealPart() + this.getImaginaryPart() * this.getImaginaryPart());
	}

	@Override
	/* Prints the complex number in the format. */
	public String toString() {
		String a1 = Double.toString(this.a);
		String b1 = Double.toString(this.b);
		if (this.b == 0) {
			return a1;
		} else {
			return (a1 + "+" + b1 + "i");

		}
	}
}