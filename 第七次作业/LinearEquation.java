
public class LinearEquation {
	private int a,b,c,d,e,f;
	LinearEquation(int a,int b,int c,int d,int e,int f){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
	}
	
	public void setA(int a) {
		this.a=a;
	}
    public void setB(int b) {
		this.b=b;
	}
    public void setC(int c) {
		this.c=c;
	}
    public void setD(int d) {
		this.d=d;
	}
    public void setE(int e) {
		this.e=e;
	}
    public void setF(int f) {
		this.f=f;
	}
    public boolean isSolvable() {
    	if(a*d-b*c!=0)
    		return true;
    	return false;
    }
    public double getX() {
    	return (double)(e*d-b*f)/(a*d-b*c);
    }
    public double getY() {
    	return (double)(a*f-e*c)/(a*d-b*c);
    }
}
