
public class circleooo {
	private double radius=1;
	private static int numberOfObjects=0;
	circleooo(){
		numberOfObjects++;
	}
	circleooo(double newradius){
		radius=newradius;
		numberOfObjects++;
	}
	public double getradius() {
		return radius;
	}
	public void setradius(double newradius) {
		radius=(newradius>=0)?newradius:0;
	}
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	public double getArea() {
		return radius*radius*Math.PI ;
	}

}
