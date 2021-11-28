
public class TestCircleWithPrivateDataFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circleooo mycircle=new circleooo(5.0);
		System.out.println("The area of the circle of radius "+mycircle.getradius()+" is "+mycircle.getArea());
		mycircle.setradius(mycircle.getradius()*1.1);
		System.out.println("The area of the circle of radius "+mycircle.getradius()+" is "+mycircle.getArea());
		System.out.println("The number of objects created is "+circleooo.getNumberOfObjects());
	}

}
