package Day5_LambdaFun.Que4;

import java.util.Arrays;
import java.util.List;

public class Demo {
	
		public static void displayCity(List<String> city) {
				System.out.println(city);
			}

	public static void main(String[] args) {
		List<String> cityList = Arrays.asList("Bhopal","Indore","Jabalpur","Chennai","Banglore");
		
		printList p1 = Demo::displayCity;
		p1.display(cityList);
		
	}

}
