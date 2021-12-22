import java.util.*;
public class bookTraversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book t=new book();
		book czz=new book("001","czzsb",15,"319Àﬁ…·");
		book yjn=new book("002","yjnsb",13,"319Àﬁ…·");
		book hkf=new book("003","hkfsb",14,"319Àﬁ…·");
		List<book> books=new ArrayList<book>();
		books.add(hkf);
		books.add(czz);
		books.add(yjn);
		for(int i=0;i<books.size()-1;i++) {
			for(int j=books.size()-1;j>i;j--) {
				if(books.get(j).price<books.get(j-1).price) {
					t.set(books.get(j));
					books.get(j).set(books.get(j-1));
					books.get(j-1).set(t);
				}
			}
		}
		for(int i=0;i<books.size();i++)
			System.out.println(books.get(i).name);
	}

}
