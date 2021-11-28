
public class GeometricObject {
	private String color ="white";
	private boolean filled;
	private java.util.Date DateCreated;
	
	public GeometricObject() {
		DateCreated=new java.util.Date();
	}
	public GeometricObject(String color,boolean filled) {
		DateCreated=new java.util.Date();
		this.color=color;
		this.filled=filled;
	}
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color=color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean Filled) {
		this.filled=Filled;
	}
	public java.util.Date getDateCreated(){
		return DateCreated;
	}
	public String toString() {
		return "created on"+DateCreated+"\ncolor: "+color+" and filled: "+filled;
	}
}
