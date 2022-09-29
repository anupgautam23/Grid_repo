package Day5_LambdaFun.Que2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		
		List<String> cityList = new ArrayList<>();
		cityList.add("Chennai");
		cityList.add("Bhopal");
		cityList.add("Indore");
		

		System.out.println("Before sorting "+cityList);

		Collections.sort(cityList,(o1,o2)-> o1.compareTo(o2));
		
		
		System.out.println("After sorting "+cityList);
		
		
		
	}

}
