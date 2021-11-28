
public class TestPassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circleooo circle=new circleooo(1);
		int n=5;
		printArea(circle,n);
		System.out.println("\nRadius is "+circle.getradius());
		System.out.println("n is "+n);
	}
	public static void printArea(circleooo c,int times) {
		System.out.println("Radius \t\tArea");
		while(times>=1) {
			System.out.println(c.getradius()+"\t\t"+c.getArea());
			c.setradius(c.getradius()+1);
			times--;
		}
	}
}
