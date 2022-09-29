package C2_Evaluation.Que2;

import java.util.function.Supplier;

import C2_Evaluation.Que3.Student;

public class MySupplier {

	public static void main(String[] args) {
		
		Supplier<Student> supplier = ()-> new Student(10,"Anup",200,"Bhopal");
		
		Student student =  supplier.get();
		
		System.out.println(student);

	}

}
