package Day2_HashMap.Que3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
	Map<String, String> lhMap = new LinkedHashMap<>();
	lhMap.put("Madhyapradesh", "Bhopal");
	lhMap.put("Bihar", "Patna");
	lhMap.put("Uttarpradesh", "Lucknow");
	lhMap.put("Rajsthan", "Jaipur");
	lhMap.put("Chhattishgarh", "Raipur");
	lhMap.put("Punjab", "Amritsar");
	

	Set<Map.Entry<String, String>> set = lhMap.entrySet();
	for (Map.Entry<String, String> e : set) {
		System.out.println(e.getKey()+"  capital is "+e.getValue());
	}
	}

}
