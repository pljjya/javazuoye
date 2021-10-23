import java.util.Scanner;
public class sanjiaoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter three numbers:");
		int a[]=new int[3];
		int i;
		for(i=0;i<3;i++) {
			a[i]=input.nextInt();
		}
		if(a[0]+a[1]<=a[2]||a[2]+a[1]<=a[0]||a[2]+a[1]<=a[0])
			System.out.println("shurenzhibuhefa!");
		else
			System.out.println("shurenzhihefa!");
	}

}
