
public class jisuanjinrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=10000;
		int i;
		for(i=1;i<=10;i++)
			a*=1.05;
		double sum=0;
		for(i=1;i<=4;i++) {
			sum+=a;
			a*=1.05;
		}
		System.out.print("money is"+sum);
	}

}
