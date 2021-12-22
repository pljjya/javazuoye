import java.util.Date;
public class Transaction {
	Date date;
	public char type;
	public double amount;
	public double balance;
	public String description;
	public Transaction() {
	}
	public void settype(char type) {
		this.type=type;
	}
	public Transaction(Date date,char type,double amount,double balance,String description) {
		this.balance=balance;
		this.date=date;
		this.type=type;
		this.amount=amount;
		this.description=description;
	}
}
