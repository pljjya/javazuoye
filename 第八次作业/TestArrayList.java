import java.util.ArrayList;
public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> citylist =new ArrayList<>();
		citylist.add("London");
		citylist.add("Denver");
		citylist.add("Paris");
		citylist.add("Miami");
		citylist.add("Seoul");
		citylist.add("Tokyo");
		System.out.println("List size? "+citylist.size());
		System.out.println("Is Miami in the list? "+citylist.contains("Miami"));
		System.out.println("The localtion of Denver in the list? "+citylist.indexOf("Denver"));
		System.out.println("Is the list empty? "+citylist.isEmpty());
		citylist.add(2,"Xian");
		citylist.remove("Miami");
		citylist.remove(1);
		System.out.println(citylist.toString());
		for(int i=citylist.size()-1;i>=0;i--)
			System.out.println(citylist.get(i)+" ");
		System.out.println();
		
		ArrayList<Circle> list=new ArrayList<>();
		
		list.add(new Circle(2));
		list.add(new Circle(3));
		System.out.println("The area of the circle? "+list.get(0).getArea());
	}
}
