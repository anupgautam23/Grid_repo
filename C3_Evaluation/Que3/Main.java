package C3_Evaluation.Que3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		MyCollable[] m1 = {
				new MyCollable(2),
				new MyCollable(4),
				new MyCollable(5),
				new MyCollable(6),
				new MyCollable(7),
				new MyCollable(8),
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for (MyCollable myCollable : m1) {
		   Future future =   service.submit(myCollable);
		   System.out.println("product of "+myCollable.num+" is "+ future.get());
		}
		
		
		service.shutdown();

	}

}
