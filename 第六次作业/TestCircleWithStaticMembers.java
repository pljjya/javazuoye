
public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is "+Ccc.numberOfObjects);
		Ccc c1=new Ccc();
		System.out.println("\nAfter creating c1");
		System.out.println("c1:radius("+c1.radius +")and number of Circle objects("+c1.numberOfObjects +")");
		Ccc c2=new Ccc();
		c1.radius =9;
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1:radius("+c1.radius+") and number of Circle objects("+c1.numberOfObjects +")");
		System.out.println("c2:radius("+c2.radius+") and number of Circle objects("+c2.numberOfObjects +")");
	}

}
