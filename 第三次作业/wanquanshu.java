
public class wanquanshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,n,sum;
		for(i=1;i<=10000;i++) {
			sum=1;
			n=i/2;
			j=2;
			while(j<n) {
				if(i%j==0) {
					sum+=j;
					sum+=i/j;
					n=i/j;
				}
				j++;
			}
			if(sum==i&&i!=1)
				System.out.print(i+" ");
		}
	}

}
