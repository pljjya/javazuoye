import java.util.Scanner;

public class rili {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter year and xingqiji:");
		int n=input.nextInt();
		int x=input.nextInt();
		int i,j,k,f=1;
		String[] yue=new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
		String[] xq=new String[]{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int s[]=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		if(x==7) x=0;
		if(n%4==0&&n%100!=0||n%400==0) s[1]++;
		for(i=0;i<12;i++) {
			System.out.println("      "+yue[i]+" "+n);
			System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！");
			System.out.println("Sun Mon Tue Wes Thu Fri Sat");
			for(k=0;f<=s[i];k++) {
				if(k%7==0)
					System.out.println();
				if(k<x) 
					System.out.print("    ");
				else {
					System.out.print("  "+f+" ");
					f++;
				}
				
			}
			System.out.println();
			f=1;
			x=k%7;
		}
	}

}
