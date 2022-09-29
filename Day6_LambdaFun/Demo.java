package Day6_LambdaFun;

import java.util.function.Consumer;
import java.util.function.Function;

import Day6_LambdaFun.Que2.myConsumer;
import Day6_LambdaFun.Que3.Student;

public class Demo {

	public static void main(String[] args) {
		
//		Function<Student, String> f1= new MyFunction();
//		System.out.println(f1.apply(new Student(10,"ram","@",200)));
//		
//		Function<Student, String> f2 = s ->s.getMarks()>300 ? "pass" : "fail";
//		
//		 System.out.println(f2.apply(new Student(10,"ram","@",400)))
		
		Consumer<Student> consumer= new MyConsumer();
		consumer.accept(new Student(10,"anup","anup@gmail.com",300) );
		
		Consumer<Student> consumer2 = s->System.out.println(s);
		consumer2.accept(new Student(10,"anup","anup@gmail.com",300) );
		
		
		 	
	
	}

}
