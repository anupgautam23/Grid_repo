package C3_Evaluation.Que4;

public class B implements Runnable{

	@Override
	public void run() {
		
		
			
		
		int prod =1; 
		System.out.println("inside "+Thread.currentThread().getName());
		
		for(int i=1;i<10;i++)
		{
			prod=prod*i;
		}
		System.out.println(Thread.currentThread().getName()+" prod of 10 number is"+prod);
		
	}

}
