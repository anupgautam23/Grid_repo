package Day6_LambdaFun.Que2;

import java.util.function.Function;

import Day6_LambdaFun.Que3.Student;

public class myFunction {

	public static void main(String[] args) {
		
		Function<Student, String> f1 = s-> s.getMarks()>300 ?"pass":"fail";
		System.out.println(f1.apply(new Student(10,"ram","ram@gmail.com",400)));

	}

}
