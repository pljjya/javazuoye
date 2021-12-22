import java.util.*;
public class question__zhuangxiang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of objects:");
		int number=input.nextInt();
		tong[] T=new tong[number];
		int i,j,room;
		System.out.print("Enter the weights of objects:");
		for(i=0;i<number;i++) {
			T[i]=new tong();
		}
		for(i=0;i<number;i++) {
			room=input.nextInt();
			j=0;
			while(T[j].room<room)
				j++;
			T[j].room-=room;
			T[j].size++;
			T[j].objectnumber[room]++;
		}
		//System.out.println(T.objectnumber[0][7]);
		i=0;
		while(T[i].size!=0) {
			System.out.print("Container "+(i+1)+" contains objects with weight");
			for(j=10;j>=1;j--) {
				if(T[i].objectnumber[j]!=0) {
					while(T[i].objectnumber[j]!=0) {
						T[i].objectnumber[j]--;
					    System.out.print(" "+j);
					}
				}
					
			}
			System.out.println();
			i++;
		}
		
	}

}
