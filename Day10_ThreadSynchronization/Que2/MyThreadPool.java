package Day10_ThreadSynchronization.Que2;

public class MyThreadPool implements Runnable{
	
	String name;

	public MyThreadPool(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		
		System.out.println(name+" is taken work from "+Thread.currentThread().getName());
		
	}
	
	

}
