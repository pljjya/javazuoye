import java.util.Scanner;

public class lingyigejinzita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the number of lines:");
		int h=8;
		int i,j,k;
		int[] a=new int [8];
		a[0]=1;
		for(i=1;i<h;i++) {
			a[i]=a[i-1]*2;
		}
		for(i=1;i<=h;i++) {
			for(j=1;j<=h-i;j++)
				System.out.print("  ");
			for(j=1;j<=i*2-1;j++) {
				k=a[i-Math.abs(j-i)-1];
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
