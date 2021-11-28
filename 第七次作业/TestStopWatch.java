
public class TestStopWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[100000];
		int t,k,i,j;
		for(i=0;i<100000;i++) {
			a[i]=(int)(Math.random()*1000);
		}
		StopWatch sy=new StopWatch();
		for(i=0;i<99999;i++){
			k=i;
			for(j=i+1;j<100000;j++) {
				if(a[j]<a[k])
					k=j;
			}
			t=a[k];
			a[k]=a[i];
			a[i]=t;
		}
		sy.stop();
		System.out.print(sy.getElapsedTime());
	}

}
