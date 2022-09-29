package C3_Evaluation.Que5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Demo2 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d://studentdata.txt"));
		
		List<Student> newList =  (List<Student>) ois.readObject();
		
		newList.forEach(s->System.out.println(s));
		
		
		newList.add(new Student(6, "Rahul", 500, "Rahul@gmail.com","Rahul123",new Address("MP", "Bhopal", "9876543")));
		
		ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream("d://studentdata.txt"));
		
		oos.writeObject(newList);
		
		oos.close();
		
		System.out.println(" Re-serialization done");
		
		
	}

}
