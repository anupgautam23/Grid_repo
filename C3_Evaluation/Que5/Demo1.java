package C3_Evaluation.Que5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		List<Student> sList = new ArrayList<>();
		sList.add(new Student(1, "amit", 100, "amit@gmail.com","amit123",new Address("MH", "mumbai", "257625")));
		sList.add(new Student(2, "Roshan", 200, "Roshan@gmail.com","Roshan123",new Address("CG", "Raipur", "547625")));
		sList.add(new Student(3, "Vishwas", 250, "Vishwas@gmail.com","Vishwas123",new Address("UP", "lucknow", "637625")));
		sList.add(new Student(4, "Rohit", 370, "Rohit@gmail.com","Rohit123",new Address("BH", "patna", "6553625")));
		sList.add(new Student(5, "Virat", 400, "Virat@gmail.com","Virat123",new Address("RJ", "jaipur", "875455")));
		
		
		ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream("d://studentdata.txt"));
		oos.writeObject(sList);
		
		oos.close();
		
		System.out.println("done");
		

	}

}
