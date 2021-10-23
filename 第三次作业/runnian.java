
public class runnian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k=0,sum=0;
		for(i=101;i<=2100;i++) {
			if(i%4==0&&i%100!=0||i%400==0) {
				k++;
				sum++;
				System.out.print(i+" ");
				if(k==10) {
					k=0;
					System.out.println();
				}
			}
		}
		System.out.print("Sum is:"+sum);
	}

}
