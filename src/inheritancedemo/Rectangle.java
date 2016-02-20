package inheritancedemo;

public class Rectangle extends Shape {
	private double height;
	private double width;
	
	public Rectangle(){
		this("N/A","Red",1.00,1.00);
	}
	public Rectangle ( String name, String color, double height, double width){
		super(name,color);
		this.height = height;
		this.width = width;
	}
	
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea(){
		return this.height * this.width;
	}
	public double getPerimeter(){
		return 2 *(this.height + this.width);
	}
	@Override
	public String toString(){
		return  (super.toString() + String.format("Height: %.2f\nWidth: %.2f\n",this.height, this.width));
		
	}
	
	@Override
	public boolean equals(Object o){
		Rectangle r2 = (Rectangle)o;
		return r2.getHeight() == this.height && r2.getWidth() == this.width;
	}
}
