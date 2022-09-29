package C1_Evaluation.Que1;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {
	
	public static Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){
		
		
		Set<Map.Entry<Employee, String>> set =  originalMap.entrySet();
		List<Map.Entry<Employee, String>> list =  new LinkedList<>(set);
		
		
		Collections.sort(list, new Comparator<Map.Entry<Employee, String>>() {

			@Override
			public int compare(Entry<Employee, String> o1, Entry<Employee, String> o2) {
				
				return o2.getKey().getSalary()-o1.getKey().getSalary();
			}

		});
		
		Map<Employee, String> newhasMap =  new LinkedHashMap<>();
		
		for(Map.Entry<Employee, String> e:list)
		{
			newhasMap.put(e.getKey(), e.getValue());
		}
		return  newhasMap ; 
	}


	public static void main(String[] args) {
		
		Map<Employee, String> hMap =  new HashMap<>();
		
		hMap.put(new Employee(10,"Ashish",10000), "Chennai");
		hMap.put(new Employee(11,"Rohit",12000), "Chennai");
		hMap.put(new Employee(12,"Saurav",13000), "Chennai");
		hMap.put(new Employee(13,"Sanjay",9000), "Chennai");
		hMap.put(new Employee(14,"Amit",9500), "Chennai");
		
		Map<Employee, String> newMap = sortMapUsingEmployeeSalary(hMap);
		
		Set<Map.Entry<Employee, String>> set = newMap.entrySet();
		
		for(Map.Entry<Employee, String> aa:set){
			System.out.println(aa.getKey()+"              "+aa.getValue());
		}
		
	}

}
