
public class book {
	public String number;
	public String name;
	public int price;
	public String outplace;
	public book(){
		
	}
	public book(String number,String name,int price,String outplace){
		this.name=name;
		this.number=number;
		this.outplace=outplace;
		this.price=price;
	}
	public void set(book temp) {
		this.name=temp.name;
		this.number=temp.number;
		this.outplace=temp.outplace;
		this.price=temp.price;
	}
}
