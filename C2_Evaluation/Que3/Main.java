package C2_Evaluation.Que3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Student> studentsList = new ArrayList<>();
		
		studentsList.add(new Student(10, "Anup", 520, "Bhopal"));
		studentsList.add(new Student(11, "Saurav", 420, "Indore"));
		studentsList.add(new Student(12, "Pramod", 300, "Nagpur"));
		studentsList.add(new Student(13, "Sanjay", 680, "Chennai"));
		studentsList.add(new Student(14, "Vikash", 700, "pune"));
		
		   			List<Employee> employees=	studentsList.stream()
		   						.filter(s1->s1.getMarks()>500)
		   						.map(s1-> new Employee(s1.getRoll(),s1.getName(),s1.getMarks()*1000,s1.getAddress()))
		   						.collect(Collectors.toList());
		   			
		   			employees.forEach(emp->System.out.println(emp));
	}

}
