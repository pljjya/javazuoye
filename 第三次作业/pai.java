import java.util.Scanner;

public class pai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		int i;
		double pai=0;
		for(i=1;i<=n;i++) {
			if(i%2==0)
				pai-=1/(double)(2*i-1);
			else
				pai+=1/(double)(2*i-1);
		}
		System.out.print("pai="+4*pai);
	}

}
