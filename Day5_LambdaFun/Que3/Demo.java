package Day5_LambdaFun.Que3;

import Day6_LambdaFun.Intr;

public class Demo {

	public static void main(String[] args) {
		
		X x1 = Integer::parseInt;
		System.out.println(x1.convetStringToNumber("100")+200);
	}

}
