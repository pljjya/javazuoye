import java.util.Scanner;

public class stringsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String s=input.next();
		System.out.println(sort(s));
	}
	public static String sort(String s) {
		char[] kk=s.toCharArray();
		char t;
		int i,j;
		for(i=0;i<s.length();i++) {
			for(j=s.length()-1;j>=i+1;j--){
				if(kk[j-1]>kk[j]) {
					t=kk[j-1];
					kk[j-1]=kk[j];
					kk[j]=t;
				}
			}
		}
		return new String(kk);
	}

}
