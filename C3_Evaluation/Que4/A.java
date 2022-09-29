package C3_Evaluation.Que4;

public class A implements Runnable{

	@Override
	public void run() {
		
		synchronized (this) {
			int sum = 0 ; 
			
			System.out.println("inside "+Thread.currentThread().getName());
			
			for(int i=0;i<20;i++)
			{
				sum+=i;
			}
			System.out.println(Thread.currentThread().getName()+" sum of 20 number is"+sum);
			
			this.notify();
		}
		
	}

}
