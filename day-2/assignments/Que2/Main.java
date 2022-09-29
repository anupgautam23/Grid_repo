package Day2.Que2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String>  city =  new ArrayList();
		city.add("Delhi");
		city.add("Mumbai");
		city.add("Bhopal");

		
		PrintList printList = (city1)  -> {
			for(String cityname:city1) {
				System.out.println("welcome to "+cityname);	
			}
		};
		
		
		printList.display(city);
	}
	

}

interface PrintList {
abstract void display(List<String> city);
}
