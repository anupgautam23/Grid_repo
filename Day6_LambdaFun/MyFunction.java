package Day6_LambdaFun;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import Day6_LambdaFun.Que3.Student;

public class MyFunction implements Function<Student, String>{

	@Override
	public String apply(Student s) {
		if(s.getMarks()>300)
			return "pass";
		else {
			return "fail";
			
			
					
		}
	}

	
}
