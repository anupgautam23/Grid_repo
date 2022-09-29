package C2_Evaluation.Que2;

import java.util.function.Function;

import C2_Evaluation.Que3.Student;

public class MyFunction {

	public static void main(String[] args) {
		
		Function<Student, String> f1  = s-> s.getMarks()>500 ? "pass": "fail";
		
		System.out.println(f1.apply(new Student(10,"Anup",600,"Bhopal")));
		
		System.out.println(f1.apply(new Student(20,"Vinod",400,"Indore")));

	}

}
