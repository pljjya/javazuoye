import java.util.Scanner;

public class shuzijinzita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the number of lines:");
		int h=input.nextInt();
		int i,j,k;
		for(i=1;i<=h;i++) {
			for(j=1;j<=h-i;j++)
				System.out.print("  ");
			for(j=1;j<=i*2-1;j++) {
				k=1+Math.abs(j-i);
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
