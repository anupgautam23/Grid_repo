package C3_Evaluation.Que2;

import javax.xml.transform.Source;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread mT = new MyThread();
		mT.start();
		
		synchronized (mT) {
			
			System.out.println("main thread getting into waiting state");
			mT.wait();
			System.out.println("main thread notified");
		} 

		System.out.println( "the product of 1 to  10 is:- "+ mT.prod);
	}

}
