import java.util.Scanner;

public class DtoO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number:");
		int h=input.nextInt();
		htob(h);

	}
	public static void htob(int h) {
		if(h>=8)
		   htob(h/8);
		System.out.print(h%8);
	}

}
