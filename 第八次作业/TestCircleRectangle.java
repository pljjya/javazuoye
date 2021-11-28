
public class TestCircleRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle =new Circle(1);
		System.out.println("A circle "+circle.toString());
		System.out.println("The color is "+circle.getcolor());
		System.out.println("The radius is "+circle.getradius());
		System.out.println("The area is "+circle.getArea());
		System.out.println("The diameter is "+circle.getPerimeter());
		
		Rectangle r=new Rectangle(2,4);
		System.out.println("\nThe rectangle "+r.toString());
		System.out.println("The area is "+r.getArea());
		System.out.println("The perimeter is "+r.getPerimeter());
	}

}
