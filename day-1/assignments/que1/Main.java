package Que1;

import java.util.HashMap;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("Madhyapradesh", "Bhopal");
		hm.put("Rajasthan", "Jaipur");
		hm.put("Bihar", "Patna");
		hm.put("Maharastra", "Mumbai");
		hm.put("Chhattisgarh", "Raipur");
		
		
		Set<HashMap.Entry<String, String>> states  = hm.entrySet();
		
		System.out.println("The Indian states and their Capital is - ");
		for(HashMap.Entry<String, String> x:states) {
			System.out.println(x.getKey()+"  -------->  "+x.getValue());
		}
	}

}
