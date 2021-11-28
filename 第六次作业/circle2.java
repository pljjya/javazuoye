
public class circle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle2 circle1=new circle2();
		System.out.println("The area of the circle of radius "+circle1.radius+" is "+circle1.getArea());
		circle2 circle2=new circle2(25);
		System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
		circle2 circle3=new circle2(125);
		System.out.println("The area of the circle of radius "+circle3.radius+" is "+circle3.getArea());
		circle2.radius=100;
		System.out.println("The area of the circle of radius "+circle3.radius+" is "+circle3.getArea());
	}
	double radius;
	circle2(){
		radius=1;
	}
	circle2(double newRadius){
		radius=newRadius;
	}
	double getArea() {
		return radius*radius*Math.PI ;
	}
	double getPerimeter() {
		return radius*2*Math.PI ;
	}
	void setRadius(double newRadius) {
		radius=newRadius;
	}
}
