
public class StopWatch {
	private long startTime;
	private long endTime;
	StopWatch(){
		startTime=System.currentTimeMillis();
	}
	public void start() {
		startTime=System.currentTimeMillis();
	}
	public void stop() {
		endTime=System.currentTimeMillis();
	}
	public long getElapsedTime() {
		return endTime-startTime;
	}
}
