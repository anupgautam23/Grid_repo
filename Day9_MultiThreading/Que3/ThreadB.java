package Day9_MultiThreading.Que3;

public class ThreadB extends Thread{
	ThreadA ta1;
	
	public ThreadB(ThreadA ta1) {
		super();
		this.ta1 = ta1;
	}

	@Override
	public void run() {
		try {
			ta1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
				System.out.println("The odd number is "+i);
		}
		
		
	}

}
