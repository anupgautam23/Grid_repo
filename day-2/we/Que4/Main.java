package Day2_HashMap.Que4;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import Day2_HashMap.Que2.SortStudentByMarks;
import Day2_HashMap.Que2.Student;

public class Main {
	
//	public static sortByValue() {
//		
//	}

	public static void main(String[] args) {
		
		Map<String, Student> stMap = new HashMap<>();
		stMap.put("Bihar", new Student(1,"Ashish",900));
		stMap.put("madhyapradesh", new Student(2,"Saurav",800));
		stMap.put("Uttarpardesh", new Student(3,"Sanjay",850));
		stMap.put("Maharshtra", new Student(4,"Bhumesh",750));
		stMap.put("Chhattisgarh", new Student(5,"Anup",670));
		
		Set<Map.Entry<String, Student>> set =  stMap.entrySet();
		List<Map.Entry<String, Student>> list =  new LinkedList<>(set);
		
		Collections.sort(list,new Comparator<Map.Entry<String, Student>>() {

			@Override
			public int compare(Entry<String, Student> o1, Entry<String, Student> o2) {
				
				return (o1.getValue().getMarks())-o2.getValue().getMarks();
			}
		});
		
		HashMap<String, Student> hMap=  new LinkedHashMap<>();
		
		for (Entry<String, Student> e : list) {
			hMap.put(e.getKey(), e.getValue());
		}
		
		Set<Map.Entry<String, Student>> newset   =  hMap.entrySet();
		
		for(Map.Entry<String, Student> aa:newset)
		{
			System.out.println("state is "+ aa.getKey());
			System.out.println("----------------------");
			System.out.println("Roll is "+aa.getValue().getRoll());
			System.out.println("Name is "+aa.getValue().getName());
			System.out.println("Marks is "+aa.getValue().getMarks());
			System.out.println();
		}

	}

}
