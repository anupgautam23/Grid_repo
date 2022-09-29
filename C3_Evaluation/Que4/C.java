package C3_Evaluation.Que4;

import java.util.Iterator;

public class C implements Runnable {

	@Override
	public void run() {
		System.out.println("inside "+Thread.currentThread().getName());
		
		for(int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}

}
