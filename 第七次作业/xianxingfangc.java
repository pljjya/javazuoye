import java.util.Scanner;
public class xianxingfangc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("six numbers for a,b,c,d,e and f:");
		LinearEquation kk=new LinearEquation(input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
		if(!kk.isSolvable())
			System.out.print("The equation has no roots.");
		else
			System.out.print("The X="+kk.getX()+"\nThe Y="+kk.getY());
	}

}
