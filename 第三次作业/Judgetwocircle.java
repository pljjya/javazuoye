import java.util.Scanner;

public class Judgetwocircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the first x,y,r:");
		Double x1=input.nextDouble();
		Double y1=input.nextDouble();
		Double r1=input.nextDouble();
		System.out.print("Enter the second x,y,r:");
		Double x2=input.nextDouble();
		Double y2=input.nextDouble();
		Double r2=input.nextDouble();
		Double gl=Math.abs(x1-x2)*Math.abs(x1-x2)+Math.abs(y1-y2)*Math.abs(y1-y2);
		Double rgl=Math.abs(r1-r2);
		if(gl<=rgl*rgl)
			System.out.println("circle2 is inside circle1");
		else if(gl>=(r1+r2)*(r1+r2))
			System.out.println("r2 does not overlaps r1");
		else
			System.out.println("circle2 overlaps circle1");
	}

}
