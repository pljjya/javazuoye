import java.util.Scanner;

public class averageanddeviation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter ten number:");
		double n,sum=0,ssum=0;
		int i;
		for(i=1;i<=10;i++) {
			n=input.nextDouble();
			sum+=n;
			ssum+=n*n;
		}
		System.out.println("The mean is "+(double)sum/10);
		System.out.print("The standard deviation is "+Math.sqrt((ssum-sum*sum/10)/9));

	}

}
