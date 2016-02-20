package chapter11;

import java.util.Scanner;

public class TriangleFromSimpleGeometricObject {

	/**
	 * This class generates a cirlce with three sides and two more data fields
	 * named color and filled.
	 * 
	 * @author Ashish Lamichhane
	 */
	public static void main(String[] args) {
		double side1; // stores side 1.
		double side2; // stores side 2.
		double side3; // stores side 3.
		String color; // stores color.
		boolean filled; // stores either circle is filled or not.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); // creates scanner to input the
												// data.
		System.out.print("Enter the side 1: ");
		side1 = input.nextDouble(); // assigns next double value to side1.
		System.out.print("Enter the side 2: ");
		side2 = input.nextDouble(); // assigns next double value to side2.
		System.out.print("Enter the side 3: ");
		side3 = input.nextDouble(); // assigns next double value to side3.
		System.out.print("Enter the color : ");
		color = input.next(); // assigns next string to color.
		System.out.print("Enter if the triangle is filled or not:  ");
		filled = input.nextBoolean(); // assigns next boolean value to filled.

		Exercise11_01 triangle1 = new Exercise11_01(color, filled, side1,
				side2, side3); // creates a new Exercise11_01 object.
		System.out.println(String.format("Area: %.2f", triangle1.getArea())); // prints
																				// area
																				// of
																				// the
																				// triangle.
		System.out.println(String.format("Perimeter: %.2f",
				triangle1.getPerimeter())); // prints perimeter of the triangle.
		System.out.println(String.format("Area: %s", triangle1.getColor())); // prints
																				// color
																				// of
																				// the
																				// triangle.
		System.out.println(String.format("Filled: %s",
				String.valueOf(triangle1.isFilled()))); // prints either the
														// triangle is filled or
														// not.
	}

}
