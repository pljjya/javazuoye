
public class Randomtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nextInt(100);
	}
	public static void nextInt(int n) {
		Random kk=new Random(n);
		for(int i=1;i<=50;i++) {
			kk.setRandom(n);
		    System.out.print(kk.r+" ");
		}
	}
}
