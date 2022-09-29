package Day9_MultiThreading;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
			Common c = new Common();
			Common c1 = new Common();
			ThreadA t1 =  new ThreadA(c, "raj");
			ThreadB t2 = new ThreadB(c1, "Simaran");
			
			t1.start();
			t2.start();
		}


}
