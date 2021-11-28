import java.util.GregorianCalendar;
public class GregorianCalendarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar date=new GregorianCalendar();
		System.out.println(date.get(GregorianCalendar.YEAR)+"."+date.get(GregorianCalendar.MONTH)+"."+date.get(GregorianCalendar.DAY_OF_MONTH));
		date.setTimeInMillis(1234567898765L);
		System.out.println(date.get(GregorianCalendar.YEAR)+"."+date.get(GregorianCalendar.MONTH)+"."+date.get(GregorianCalendar.DAY_OF_MONTH));
	}

}
