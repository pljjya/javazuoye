import java.util.Scanner;

public class Judegesanjiaoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates:");
		Double x=input.nextDouble();
		Double y=input.nextDouble();
		if(x>0&&y>0&&2*y+x<200)
			System.out.print("The point is in the triangle");
		else
			System.out.print("The point is not in the triangle");
	}

}
