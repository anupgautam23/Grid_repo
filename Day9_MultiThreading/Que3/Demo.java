package Day9_MultiThreading.Que3;

public class Demo {

	public static void main(String[] args) {
		
		ThreadA a1  = new ThreadA();
		ThreadB b1  = new ThreadB(a1);
		
		a1.start();
		
		b1.start();
		
		
		

	}

}
