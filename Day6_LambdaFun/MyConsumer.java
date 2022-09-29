package Day6_LambdaFun;

import java.util.function.Consumer;

import Day6_LambdaFun.Que3.Student;

public class MyConsumer implements Consumer<Student> {

	@Override
	public void accept(Student t) {
		
		System.out.println("inside accept");
		System.out.println(t.getRoll());
		System.out.println(t.getName());
		System.out.println(t.getEmail());
		System.out.println(t.getMarks());
		
	}

	

}
