import java.util.Scanner;
public class judgesquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter two numbers:");
		int x=input.nextInt();
		int y=input.nextInt();
		if(x<=5&&x>=-5&&y<=2.5&&x>=-2.5)
			System.out.println("It's in square");
		else
			System.out.println("It's not in square");
		
	}

}
