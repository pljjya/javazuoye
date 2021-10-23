
public class choupai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pai=(int)(Math.random()*13)+1;
		if(pai==1)
			System.out.print("The card your picked is Ace of ");
		else if(pai==11)
			System.out.print("The card your picked is Jack of ");
		else if(pai==12)
			System.out.print("The card your picked is Queen of ");
		else if(pai==13)
			System.out.print("The card your picked is King of ");
		else
			System.out.print("The card your picked is "+pai+ " of ");
		int huase=(int)(Math.random()*4);
		if(huase==0)
			System.out.print("Clubs");
		else if(huase==1)
			System.out.print("Diamonds");
		else if(huase==2)
			System.out.print("Hearts");
		else if(huase==3)
			System.out.print("Spades");
	}

}
