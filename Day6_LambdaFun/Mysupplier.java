package Day6_LambdaFun;

import java.util.function.Supplier;

public class Mysupplier implements Supplier<String>{

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "this message from the exernal class";
	}

}
