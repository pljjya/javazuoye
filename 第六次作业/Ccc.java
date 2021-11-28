
public class Ccc {
	double radius;
	static int numberOfObjects=0;
	Ccc(){
		radius=1;
		numberOfObjects++;
	}
	Ccc(double newradius){
		radius=newradius;
		numberOfObjects++;
	}
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	double getArea() {
		return radius*radius*Math.PI ;
	}
	public double getRadius() {
		return radius;
	}
}
