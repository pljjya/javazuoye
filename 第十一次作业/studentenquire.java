import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class studentenquire {
	public static void appendMethodB(String fileName, String content) {  
        try {  
            //打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件  
            FileWriter writer = new FileWriter(fileName, true);  
            writer.write(content);  
            writer.close();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int age;
		String number;
		String name;
		studentdata stu=new studentdata();
		studentdata t=new studentdata();
		List<studentdata> STU=new ArrayList<studentdata>();
		number=input.next();
		while(!number.equals("exit")) {
			name=input.next();
			age=input.nextInt();
			stu=new studentdata(number,name,age);
			STU.add(stu);
			number=input.next();
		}
		for(int i=0;i<STU.size()-1;i++) {
			for(int j=STU.size()-1;j>i;j--) {
				if(STU.get(j).age<STU.get(j-1).age) {
					t.set(STU.get(j));
					STU.get(j).set(STU.get(j-1));
					STU.get(j-1).set(t);
				}
			}
		}
		input.close();
		for(int i=0;i<STU.size();i++) {
			System.out.println(STU.get(i).name);
			appendMethodB("D://output",STU.get(i).number+" "+STU.get(i).name+" "+STU.get(i).age+"\n");
		}
			
	}

}
