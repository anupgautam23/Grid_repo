package Day10_ThreadSynchronization;

import java.util.concurrent.Callable;

public class MyCollable implements Callable{
	
	int num ;
	

	public MyCollable(int num) {
		super();
		this.num = num;
	}


	@Override
	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName()+" is responsible for calc. sum of "+num+" numbers");
		int sum = 0 ;
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		return sum;
	}

}
