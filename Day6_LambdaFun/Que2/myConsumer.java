package Day6_LambdaFun.Que2;

import java.util.function.Consumer;

import Day6_LambdaFun.Que3.Student;

public class myConsumer {

	public static void main(String[] args) {
		
		Consumer<Student> c1= s -> {
			
			System.out.println("Roll is "+s.getRoll());
			System.out.println("Name is "+s.getName());
			System.out.println("Email is "+s.getEmail());
			System.out.println("Marks is "+s.getMarks());
			
		};
		c1.accept(new Student(10, "RAM", "Ram@gmail.com", 100));

	}

}
