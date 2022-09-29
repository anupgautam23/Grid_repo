package Day11_IOpackage.Que4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) throws Exception{
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d://studentdata.txt"));
		
		List<Student> stdList = (List<Student>) ois.readObject();
		
		stdList.forEach(s->System.out.println(s));
		
		
		

	}

}
