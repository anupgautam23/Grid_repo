package Day6_LambdaFun.Que2;

import java.util.function.Supplier;

import Day6_LambdaFun.Que3.Student;

public class mySupplier {

	public static void main(String[] args) {
		Supplier<Student> s1 = ()-> new Student(10, "RAM", "Ram@gmail.com", 100);
		System.out.println(s1.get());
		
		
		
	}

}
