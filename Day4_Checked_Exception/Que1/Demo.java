package Day4_Checked_Exception.Que1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an Integer - ");
		String string = scanner.next();
		try {
			int num = Integer.parseInt(string);
			System.out.println("The square value is "+ num*num);
		} catch (NumberFormatException nfe) {
			System.out.println("Entered input is not a valid format for an integer.");
		}
		
		System.out.println("The work has been don successfully ");
	}

}
