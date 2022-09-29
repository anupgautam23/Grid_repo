package Day3_ExceptionHandling.Que4;

import java.util.Comparator;

public class SortByState implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}
	
	

}
