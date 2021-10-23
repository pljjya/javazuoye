import java.util.Scanner;
public class judgeyuanxin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter two numbers:");
		int x=input.nextInt();
		int y=input.nextInt();
		if(x*x+y*y<=100)
			System.out.println("It's in circle");
		else
			System.out.println("It's not in circle");
	}

}
