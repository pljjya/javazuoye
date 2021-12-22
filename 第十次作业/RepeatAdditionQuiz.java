import java.util.*;
public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int number1=(int)(Math.random()*10);
		int number2=(int)(Math.random()*10);
		int[] a=new int[50];
		int i=0,j=0;
		System.out.print("What is "+number1+" + "+number2+"? ");
		int answer=input.nextInt();
		if(number1+number2!=answer) {
			System.out.print("Wrong answer. Try again. What is "+number1+" + "+number2+"? ");
			a[i]=answer;
			i++;
			answer=input.nextInt();
		}
		while(number1+number2!=answer) {
			for(j=0;j<i;j++) {
				if(a[j]==answer) {
					System.out.print("You already enterd "+answer);
					break;
				}
			}
			if(i==j) {
			   System.out.print("Wrong answer. Try again. What is "+number1+" + "+number2+"? ");
			   a[i]=answer;
			   i++;
			}
			answer=input.nextInt();
		}
		System.out.println("You got it!");
	}

}
