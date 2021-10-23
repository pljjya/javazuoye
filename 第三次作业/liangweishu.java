
public class liangweishu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*10);
		int b=(int)(Math.random()*10);
		while(b==a)
			b=(int)(Math.random()*10);
		System.out.print(a);
		System.out.print(b);
	}

}
