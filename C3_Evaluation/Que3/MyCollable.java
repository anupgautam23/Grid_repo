package C3_Evaluation.Que3;

import java.util.concurrent.Callable;

public class MyCollable  implements Callable{
	
	int num ; 
	
	public MyCollable(int num) {
		super();
		this.num = num;
	}

	@Override
	public Object call() throws Exception {
		
		int prod =1 ;
		System.out.println(Thread.currentThread().getName()+" is responsible for calc... product of "+num+" from 1");
		for(int i=1;i<=num;i++)
		{
			prod=prod*i;
		}
		
		return prod;
	}

}
