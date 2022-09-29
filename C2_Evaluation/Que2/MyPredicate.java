package C2_Evaluation.Que2;

import java.util.function.Predicate;

import C2_Evaluation.Que3.Student;

public class MyPredicate {

	public static void main(String[] args) {
		
		Predicate<Student> predicate = s-> s.getMarks()>500 ;
		
		System.out.println(predicate.test(new Student(1,"Anup", 400, "Bhopal")));
		
		System.out.println(predicate.test(new Student(2,"Saurav", 600, "Indore")));

	}

}
