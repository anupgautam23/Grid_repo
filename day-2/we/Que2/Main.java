package Day2_HashMap.Que2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	
	public static void ShowStudentDetail(Student student) {
		
	}

	public static void main(String[] args) {
//		Student student =  new Student();
		Map<Student, String> stMap =   new TreeMap<>(new SortStudentByMarks());
		
		stMap.put(new Student(1,"Ashish",800), "Madhyapradesh");
		stMap.put(new Student(2,"Anup",850), "Kerela");
		stMap.put(new Student(3,"Vinod",700), "maharashtra");
		stMap.put(new Student(4,"Sanjay",650), "bihar");
		
		
		Set<Map.Entry<Student, String>> set = stMap.entrySet();
		
		for(Map.Entry<Student, String>  st:set) {
			System.out.println("City is "+ st.getValue());
			System.out.println("------------------------");
			System.out.println("Roll No is "+st.getKey().getRoll());
			System.out.println("Name is "+st.getKey().getName());
			System.out.println("Marks is "+st.getKey().getMarks());
			System.out.println();
		}
		

	}

}
