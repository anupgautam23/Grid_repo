package C1_Evaluation.Que2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Mobile {
	
	static HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	public static void addMobile(String company, String model) {
		
		String message= ""; 
		
		ArrayList  list = new ArrayList();
		list.add(model);
		if(mobiles.containsKey(company)) {
			mobiles.get(company).add(model);
		}else {
			mobiles.put(company, list);
			message =  "Mobile added successfully";
		}
		System.out.println(message);
		
	}
	
	public static List<String> getModels(String company){
		
		ArrayList<String> modelList = new  ArrayList<>();
		
		modelList = mobiles.get(company);
		return modelList;
		
	}
	public static void main(String[] args) {
		addMobile("Apple", "iphone12");
		addMobile("Nokia", "Lumia");
		addMobile("Samsung", "M31");
		addMobile("Oppo", "Reno2");
		addMobile("Vivo", "VivoBook");
		addMobile("Apple", "iphone7");
		addMobile("Samsung", "Galaxy S");
		
		Scanner scanner =  new Scanner(System.in);
		System.out.println("enter company");
		String companyName = scanner.next();
		  List<String> list =getModels(companyName);
		  
		  System.out.println(list);
		
		

	}

}
