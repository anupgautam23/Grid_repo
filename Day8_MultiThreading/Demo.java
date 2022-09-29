package Day8_MultiThreading;

import javax.xml.stream.events.EndDocument;

public class Demo implements Runnable {
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("inside run "+i);
		}
		System.out.println("end of run ");
	}

	public static void main(String[] args) {
	
		Demo d1= new Demo();
		Thread t1 =  new Thread(d1);
		t1.start();
		
		for(int i=11;i<20;i++) {
			System.out.println("inside main method "+i);
		}
		System.out.println("end of main");
	}

}
