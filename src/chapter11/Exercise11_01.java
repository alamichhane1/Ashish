package chapter11;
/*
 * This class extends the SimpleGeometricObject class and calculates 
 */
public class Exercise11_01 extends SimpleGeometricObject {
	private double side1 = 1.0; // assigns default side1 to 1.0
	private double side2 = 1.0; // assigns default side2 to 1.0
	private double side3 = 1.0; // assigns default side3 to 1.0
	
	/* Creates default constructor with initial values for every data fields. */
	public Exercise11_01(){
		this("White",true,1.0,1.0,1.0);
	}
	
	/* Creates constructor that requires specific data to be passed in order to form the object. */
	public Exercise11_01(String color, boolean filled, double side1, double side2, double side3) {
		super(color,filled); // passes color and filled to the default constructor of the super class. 
		this.side1 = side1; // assigns side1 to side1 data field.
		this.side2 = side2; // assigns side2 to side3 data field.
		this.side3 = side3; // assigns side3 to side3 data field. 
	}

	/* getter for side1 */
	public double getSide1() {
		return side1;
	}

	/* getter for side2 */
	public double getSide2() {
		return side2;
	}

	/*getter for side3 */
	public double getSide3() {
		return side3;
	}
	
	/* getter method for area */
	public double getArea(){
		double halfperimeter = ((this.side1+this.side2+this.side3)/2); // calculates half perimeter. 
		return Math.sqrt((halfperimeter*((halfperimeter- this.side1)*(halfperimeter-this.side2)*(halfperimeter-this.side3))));
	}
	
	/* getter method for perimeter */
	public double getPerimeter(){
		return (this.side1+this.side2+this.side3);
	}
	
	/* creates toString method to print three sides of the triangle. */
	public String toString(){
		return ("Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3);
	}
	
}
