package C2_Evaluation.Que4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<String> List =  new ArrayList<>();
		
		List.add("Anup");
		List.add("Saurav");
		List.add("Pramod");
		List.add("Sallu");
		List.add("Himanshu");
		List.add("Ranveer");
		List.add("Salman");
		List.add("Vikas");
		List.add("Sahrukh");
		List.add("Shubham");
		
			List<String> filteredList=	List.stream()
						    .filter(n->n.length()%2==0)
						    .sorted((n1,n2)->n2.compareTo(n1))
						    .collect(Collectors.toList());
			
			List.forEach(old->System.out.println(old));
			
			
			System.out.println("-------------------------------------");
			
			
			filteredList.forEach(newlist->System.out.println(newlist));
		
	}

}
