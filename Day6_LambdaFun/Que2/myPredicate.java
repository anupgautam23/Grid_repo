package Day6_LambdaFun.Que2;

import java.util.function.Predicate;

import Day6_LambdaFun.Que3.Student;

public class myPredicate {

	public static void main(String[] args) {
		
		Predicate<Student> p1 = s-> s.getMarks()>200?true:false;
		System.out.println(p1.test(new Student(10, "RAM", "Ram@gmail.com", 300)));
		System.out.println(p1.test(new Student(10, "RAM", "Ram@gmail.com", 100)));

	}

}
