import java.util.Scanner;

public class differentshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter 10 numbers:");
		int[] a=new int[10];
		int i,k,j,n=0;
		for(i=0;i<10;i++) {
			k=input.nextInt();
			for(j=0;j<n;j++) {
				if(a[j]==k)
					break;
			}
			if(j==n) {
				a[j]=k;
				n++;
			}
		}
		 System.out.println("The number of distinct number is "+n);
		 System.out.print("The distinct number are:");
		 for(i=0;i<n;i++)
			 System.out.print(a[i]+" ");
		
	}

}
