package Day2_HashMap.Que1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void MyGenrics(List<? extends Number> iList) {
		System.out.println("inside Mygenrics");
		for(Number n:iList)
			System.out.println(n);
	}

	public static void main(String[] args) {
		
		List<Integer> list =  new ArrayList<>();
		
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("How much number u want to add ? ");
		int num  = scanner.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the number you want to add");
			int n = scanner.nextInt();
			list.add(n);
		}
		MyGenrics(list);
		
	}

}
