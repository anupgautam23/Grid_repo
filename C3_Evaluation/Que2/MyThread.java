package C3_Evaluation.Que2;

public class MyThread extends Thread {
	
	int prod = 1 ; 
	
	@Override
	public void run() {
	
		synchronized (this) {
			
			System.out.println("calculating...");
			for(int i=1;i<=10;i++)
			{
				prod=prod*i;
			}
			
			this.notify();
		}
		
		
	}

}
