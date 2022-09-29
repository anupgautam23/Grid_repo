package Day10_ThreadSynchronization.Que1;

public class Main {
	
	public static void main(String[] args) {
		MyThread a1= new MyThread();
		a1.start();
		synchronized (a1) {
			try {
				System.out.println("main thread will start waiting condition");
				a1.wait();
				System.out.println("main thread reccive the notification");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("total is "+a1.total);
	}

}
