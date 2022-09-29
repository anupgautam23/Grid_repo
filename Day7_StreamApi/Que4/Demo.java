package Day7_StreamApi.Que4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import Day7_StreamApi.Que2.Student;

public class Demo {

	public static void main(String[] args) {
		
		List<Student> students =  new ArrayList<>();
		students.add(new Student(11,"s1",400));
		students.add(new Student(12,"s2",500));
		students.add(new Student(13,"s3",600));
		students.add(new Student(14,"s4",700));
		students.add(new Student(15,"s5",650));
		
		
		List<Student> newList = students.stream()
										.filter(s->s.getMarks()>500)
										.collect(Collectors.toList());
		Set<Student> newset = new HashSet<>(newList);
		System.out.println(newset);

	}

}
