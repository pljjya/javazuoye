
public class Account {
	public String name;
	public int id;
	public double balance;
	public double annualInterestRate;
	public Transaction[] transaction=new Transaction[10];
	public int cs=0;
	public Account() {
		id=0;
		balance=0;
		annualInterestRate=0;
	}
    public Account(int id,double balance) {
		this.id=id;
		this.balance=balance;
	}
	public Account(String name,int id,double blance) {
		this.name=name;
		this.id=id;
		this.balance=balance;
	}
	public void withdraw(double money) {
		balance-=money;
		transaction[cs].settype('W');;
		transaction[cs].amount=money;
		transaction[cs].balance=this.balance;
		cs++;
	}
	public void deposit(double money) {
		balance+=money;
		transaction[cs].type='D';
		transaction[cs].amount=money;
		transaction[cs].balance=this.balance;
		cs++;
	}
}

