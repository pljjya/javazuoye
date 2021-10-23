import java.util.Scanner;

public class DtoB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number:");
		int h=input.nextInt();
		htob(h);

	}
	public static void htob(int h) {
		if(h>=2)
		   htob(h/2);
		System.out.print(h%2);
	}

}
