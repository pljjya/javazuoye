
public class studentdata {
	public String number;
	public String name;
	public int age;
	public studentdata() {
		
	}
	public studentdata(String number,String name,int age) {
		this.age=age;
		this.name=name;
		this.number=number;
	}
	public void set(studentdata temp) {
		this.name=temp.name;
		this.number=temp.number;
		this.age=temp.age;
	}
}
