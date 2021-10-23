import java.util.Scanner;

public class yuechu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter year and xingqiji:");
		int n=input.nextInt();
		int x=input.nextInt()-1;
		int i,j,k;
		String[] yue=new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
		String[] xq=new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		int s1[]=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		int s2[]=new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
		if(n%4==0&&n%100!=0||n%400==0) {
			for(i=0;i<12;i++) {
				System.out.println(yue[i]+" 1, "+n+" is "+xq[x]);
				x=(x+s2[i])%7;
			}
		}
		else {
			for(i=0;i<12;i++) {
				System.out.println(yue[i]+" 1, "+n+" is "+xq[x]);
				x=(x+s1[i])%7;
			}
		}
	}

}
