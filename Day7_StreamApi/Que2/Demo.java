package Day7_StreamApi.Que2;

import java.util.ArrayList;
import java.util.List;



public class Demo {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(10,"s0",100));
		students.add(new Student(11,"s1",150));
		students.add(new Student(12,"s2",130));
		students.add(new Student(13,"s3",160));
		students.add(new Student(14,"s4",190));
		
		Student maxStudent = students.stream()
								     .max((s1,s2)-> s1.getMarks()>s2.getMarks() ? +1:-1)
									 .get();
		System.out.println("Max marks student is  "+maxStudent);
	}

}
