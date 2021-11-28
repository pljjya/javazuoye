
public class Random {
	public int r;
	Random(int s){
		r=(int)(Math.random()*s);
	}
	public int getRandom() {
		return r;
	}
	public void setRandom(int s) {
		r=(int)(Math.random()*s);
	}
}
