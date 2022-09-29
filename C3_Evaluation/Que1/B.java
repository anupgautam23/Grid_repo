package C3_Evaluation.Que1;

public class B {
	
	public synchronized void funB(A a) {
		System.out.println("inside funB ");
		a.fun1();
	}
	
	public synchronized void fun2() {
		System.out.println("inside fun2 of B");
		}

}
