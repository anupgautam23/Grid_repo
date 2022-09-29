package Day5_LambdaFun;

import Day4_Checked_Exception.Que5.InvalidCountryException;

public class Demo {
	public Demo(int  age, int salary) throws InvalidCountryException {
		System.out.println("inside constructor of demo");
	}

	public static void main(String[] args) {
		
		System.out.println("start of mainn");
		try {
			Demo d1 = new Demo(0, 0);
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end of main");
	}
}
