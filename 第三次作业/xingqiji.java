import java.util.Scanner;
public class xingqiji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter year:");
		int k=input.nextInt();
		k%=100;
		int j=k/100;
		System.out.println("Enter month 1-12:");
		int m=input.nextInt();
		if(m==1||m==2)
			m+=12;
		System.out.println("Enter the day of the month:");
		int q=input.nextInt();
		int h=(q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
		System.out.println("Day of the week is:"+h );
		
	}

}
