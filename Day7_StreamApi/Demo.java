package Day7_StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Day6_LambdaFun.Que3.Student;

public class Demo {

	public static void main(String[] args) {
		List<Student> std1 = new ArrayList<>();
		std1.add(new Student(10,"ram","@",200));
		std1.add(new Student(11,"rim","@",250));
		std1.add(new Student(12,"rm","@",230));
		std1.add(new Student(13,"am","@",100));
		std1.add(new Student(14,"n","@",160));
	
			boolean result =std1.stream()
				            .allMatch(s->s.getMarks()>99);
		
		System.out.println(result);
		
	}

}
