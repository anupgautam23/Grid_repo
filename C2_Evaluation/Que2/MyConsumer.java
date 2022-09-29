package C2_Evaluation.Que2;

import java.util.function.Consumer;

import C2_Evaluation.Que3.Student;

public class MyConsumer {

	public static void main(String[] args) {
		
		
		Consumer<Student> consumer =  s->{
		
		System.out.println("Roll is "+s.getRoll());
		System.out.println("Name is "+s.getName());
		System.out.println("Marks is "+s.getMarks());
		System.out.println("Address is "+s.getAddress());
		};
		
		consumer.accept(new Student(1,"Anup", 500, "Bhopal"));

	}

}
