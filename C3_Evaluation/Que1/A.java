package C3_Evaluation.Que1;

public class A {
	
	public synchronized void funA(B b) {
		System.out.println("inside funA ");
		b.fun2();
	}
	
	public synchronized void fun1() {
		System.out.println("inside fun1 of A");
	}

}
