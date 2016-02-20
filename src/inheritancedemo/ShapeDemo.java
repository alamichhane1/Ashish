package inheritancedemo;
import java.util.ArrayList;

public class ShapeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle c1 = new Circle ( "Circle1","Blue",25);
		Rectangle r1 = new Rectangle("Rectangle1","Black",36,6);
		
//		// version 1
//		displayCircle(c1);
//		displayRectangle(r1);
		
		
		//version 2
//		polymorphismDisplay(c1);
//		polymorphismDisplay(r1);
		
		//version3
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(c1);
		shapes.add(r1);
		shapes.add(new Circle("Circle2","Green",5));
		shapes.add(new Circle("Cricle3","Brown",50));
		shapes.add(new Rectangle("Rectangle2","Gray",100,20));
		shapes.add(new Rectangle("Rectangle3","Orange",50,30));
		
		for(Shape s : shapes){
			polymorphismDisplay(s);
			
			if ( s instanceof Circle){
				Circle c = (Circle)s;
				System.out.println(String.format("Radius: %.2f \n",c.getRadius()));
			}else if(s instanceof Rectangle) {
				Rectangle r = (Rectangle)s;
				System.out.println(String.format("Height: %.2f\nWidth: %.2f\n",r.getHeight(),r.getWidth()));
			}
		}
		System.out.println();
		System.out.println("Number of created objects:" + Shape.getNumOfObjects());
		
	}

	static void polymorphismDisplay(Shape s){
		System.out.println(s);
		System.out.println();
		}
	
	static void displayCircle(Circle c){
		System.out.print(c);
		System.out.println(String.format("Area: %.2f \nPerimeter: %.2f",c.getArea(),c.getPerimeter()));
	}
	
	static void displayRectangle(Rectangle r){
		System.out.println();
		System.out.print(r);
		System.out.println(String.format("Area: %.2f \nPerimeter: %.2f",r.getArea(),r.getPerimeter()));
	}
}
