package Day4_Checked_Exception.Que5;

import java.util.Scanner;

public class UserRegistration {
	
	public static void registerUser(String username, String userCountry) throws InvalidCountryException {
		
		if(userCountry.equals("India")){
			System.out.println("User registration done successfully");
		}else {
			throw new InvalidCountryException("User Outside India cannot be registered");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner=  new Scanner(System.in);
		System.out.print("Enter the username ");
		String name =  scanner.next();
		System.out.print("enter userCountry ");
		String userCountry = scanner.next();
		try {
			registerUser(name, userCountry);
			
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Thank You !");
	}

}
