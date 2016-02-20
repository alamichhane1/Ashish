package inheritancedemo;

import java.util.Date;

public class Shape {
	private String name;
	private String color;
	private Date createdDate;
	private static int numOfObjects = 0;

	public Shape() {
		this("N/A", "White");
	}

	public Shape(String name, String color) {

		this.name = name;
		this.color = color;
		createdDate = new Date();
		numOfObjects++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCreatedDate() {
		return createdDate.toString();
	}

	public static int getNumOfObjects() {
		return numOfObjects;
	}
	
	@Override
	public String toString(){
	return String.format("Shape Name : %s \nColor: %s \nCreated Date: %s \n", this.name, this.color,this.createdDate.toString()  );
}

}
