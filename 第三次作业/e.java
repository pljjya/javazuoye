import java.util.Scanner;

public class e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int i;
		double[] a=new double[100001];
		double e=1;
		a[0]=1;
		for(i=1;i<=100000;i++) {
			a[i]=a[i-1]/i;
			e+=a[i];
			if(i%10000==0)
				System.out.println(i+"zhi wei:"+e);
		}
	}

}
