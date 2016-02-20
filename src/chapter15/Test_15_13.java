package chapter15;

public class Test_15_13 {

	public static void main(String[] args) throws CloneNotSupportedException {

		Exercise15_13 octagon = new Exercise15_13("Red", true, 5.0); // Creates
		// new octagon object.
		System.out.println("Area: " + octagon.getArea()); // prints area of the
		// octagon object.
		System.out.println("Perimeter: " + octagon.getPerimeter()); // prints
		// perimeter of the octagon object.

		Exercise15_13 octagon1 = (Exercise15_13) octagon.clone(); // clones
		// octagon object.
		/**
		 * Compares two objects and prints if they are equal, greater or
		 * smaller.
		 */
		if (octagon1.compareTo(octagon) == 0) {
			System.out.println("Equal");
		} else if (octagon1.compareTo(octagon) > 1) {
			System.out.println("Greater");
		} else {
			System.out.println("Smaller");
		}

	}

}
