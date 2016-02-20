package inheritancedemo;

public class Circle extends Shape {
	private double radius;
	
	public Circle(){
		this("No Name", "Blue",1);
	}
	public Circle(String name, String color, double radius){
		super(name,color) ;
		this.radius = radius ;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea(){
		return Math.PI * this.radius * this.radius ; 
	}
	
	public double getPerimeter(){
		return 2 * Math.PI * this.radius;
	}
	
	@Override
	public String toString(){
	return String.format(super.toString() + "Radius: %.2f", this.radius);
}
	
	@Override
	public boolean equals(Object o){
		Circle c2 = (Circle)o;
		return c2.getRadius() == this.radius ;
	}
	
}
