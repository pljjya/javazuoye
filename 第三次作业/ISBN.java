import java.util.Scanner;
public class ISBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the first 9digits of an ISBN as integer: ");
		Scanner input =new Scanner(System.in);
		int i=0,sum=0;
		String k;
		k=input.next();
		System.out.print("The ISBN-10 number is "+k);
		for(i=0;i<9;i++)
		    sum+=((int)k.charAt(i)-48)*(i+1);
		sum%=11;
		if(sum!=10)
			System.out.print(+sum);
		else
		    System.out.print("X");
	}

}
