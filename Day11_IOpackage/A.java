package Day11_IOpackage;

import java.io.Serializable;

public class A implements Serializable {
	int i = 10 ; 
	public void fun1() {
		System.out.println("inside fun1 of A");
		System.out.println(i);
	}
}
