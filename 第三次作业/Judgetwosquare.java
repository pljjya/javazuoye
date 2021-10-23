import java.util.Scanner;

public class Judgetwosquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the first x,y,w,h:");
		Double x1=input.nextDouble();
		Double y1=input.nextDouble();
		Double w1=input.nextDouble();
		Double h1=input.nextDouble();
		System.out.print("Enter the second x,y,w,h:");
		Double x2=input.nextDouble();
		Double y2=input.nextDouble();
		Double w2=input.nextDouble();
		Double h2=input.nextDouble();
		Double xgl=Math.abs(x1-x2);
		Double ygl=Math.abs(y1-y2);
		Double wgl=Math.abs(w1-w2);
		Double hgl=Math.abs(h1-h2);
		if((xgl<w1+w2&&ygl<h1+h2)) {
			if(xgl<=wgl/2&&ygl<=hgl/2)
				System.out.println("r2 is inside r1");
			else
				System.out.println("r2 overlap r1");
				
		}
		else
			System.out.println("r2 does not overlap r1");
	}

}
