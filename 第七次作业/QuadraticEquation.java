
public class QuadraticEquation {
	private int a;
	private int b;
	private int c;
	QuadraticEquation(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	public int getDiscriminant() {
		return b*b-4*a*a*c;
	}
	public double getRoot1() {
		if(getDiscriminant()<0)
			return 0;
		return (Math.sqrt(b*b-4*a*a*c)-b)/2/a;
	}
	public double getRoot2() {
		if(getDiscriminant()<0)
			return 0;
		return (-Math.sqrt(b*b-4*a*a*c)-b)/2/a;
	}
}
