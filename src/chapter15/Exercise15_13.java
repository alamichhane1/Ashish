package chapter15;

/**
 * This class creates an octagon object by extending geometric object and
 * implementing the compareTo and clone method. This class also calculates the
 * area and perimeter of the octagon. It is assumed that all eight sides of the
 * octagon are of equal size.
 * 
 * @author Ashish Lamichhane
 *
 */
public class Exercise15_13 extends GeometricObject implements Comparable<Exercise15_13>, Cloneable {

	private double side; // stores the side of the octagon.

	/* Default constructor for octagon object. */
	public Exercise15_13() {
		super();
	}
	/* Creates an octagon object with specific data fields. */
	public Exercise15_13(String color, boolean filled, double side) {
		super(color, filled);
		this.side = side;
	}

	@Override
	public double getArea() {
		/** Calculates the area of the octagon and returns it. */
		return (2 + 4 / (Math.sqrt(2)) * this.side * this.side);
	}

	@Override
	public double getPerimeter() {
		/** Calculates the perimeter of the octagon and returns it */
		return 8 * this.side;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		try{
			return super.clone();	/** Clones the octagon object */
		}
		catch (CloneNotSupportedException e){
			System.out.println("Cloning not allowed. ");
			return this;
		}
	}

	@Override
	public int compareTo(Exercise15_13 o) {
		/** Compares two octagon objects to find out if it is greater, smaller or equal to the other one. */
		if (this.getArea() > o.getArea()) {	// checks if the new object is smaller than this object.		
			return 1;

		} else if (this.getArea() < o.getArea()) { // checks if the new object is greater than this object. 
			return -1;
		} else {
			return 0; // returns 0 if they are equal.
		}
	}
}

