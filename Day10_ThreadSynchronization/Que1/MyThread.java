package Day10_ThreadSynchronization.Que1;

public class MyThread extends Thread{
	
	int total = 0 ; 
	@Override
	public void run() {

		System.out.println("child thread start calculation");
		synchronized (this) {
			for(int i=0;i<10;i++)
			{
				
				total+=i;
			}
			System.out.println("child thread gives notification");
			this.notify();
		}
		
		
	}
	
}
