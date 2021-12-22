
public class Real {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account George=new Account("George",1222,1000);
		George.annualInterestRate=1.5;
		George.withdraw(30);
		George.withdraw(40);
		George.withdraw(50);
		George.deposit(5);
		George.deposit(4);
		George.deposit(2);
		for(int i=0;i<George.cs;i++) {
			System.out.println(George.name+" "+George.annualInterestRate+" "+George.balance+" "+George.transaction[i].type+" "+George.transaction[i].amount);
		}
	}

}
