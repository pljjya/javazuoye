
public class Circle extends GeometricObject{
	private double radius;
	public Circle() {
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public Circle(double radius,String color,boolean filled) {
		this.radius=radius;
		setcolor(color);
		setFilled(filled);
	}
	public double getradius() {
		return radius;
	}
	public void setradius(double radius) {
		this.radius=radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	public void printCircle() {
		System.out.println("The circle is created "+getDateCreated()+" and the radius is "+radius);
	}
}
