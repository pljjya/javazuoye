import java.util.Scanner;
public class TestG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("two numbers for a,b and c:");
		QuadraticEquation kk=new QuadraticEquation(input.nextInt(),input.nextInt(),input.nextInt());
		System.out.println("the Discriminant is:"+kk.getDiscriminant());
		if(kk.getDiscriminant()<0)
			System.out.print("The equation has no roots.");
		else if(kk.getDiscriminant()==0)
			System.out.print("the Root is:"+kk.getRoot1());
		else
		    System.out.print("the Root1 is:"+kk.getRoot1()+" the Root2 is:"+kk.getRoot2());
	}

}
