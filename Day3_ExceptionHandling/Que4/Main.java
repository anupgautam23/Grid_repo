package Day3_ExceptionHandling.Que4;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Main {
	
	public static void main(String[] args) {
		Map<String,List<String>> map = new TreeMap<>(new SortByState());
		map.put("Madhyapradesh",Arrays.asList("Bhopal","Indore","Jabalpur","Satna") );
		map.put("Uttarpradesh",Arrays.asList("Kanpur","Lucknow","Allahabad","Bareli") );
		map.put("Rajasthan",Arrays.asList("Kota","Jaipur","Ajmer","Jaisalmer") );
		map.put("Chattisgarh",Arrays.asList("Raipur","Bhilai","Durg","Bilaspur") );
		
		Set<Map.Entry<String, List<String>>> set = map.entrySet();
		
		for(Map.Entry<String, List<String>> aa:set)
		{
			System.out.println("State is -"+aa.getKey() );
			List<String> sList = aa.getValue();
			System.out.println("Cities are--");
			for(String city:sList) {
				System.out.println(city);
			}
		}
	}

}
