package Day8_MultiThreading.Que7;

public class Main implements Runnable{
	
	@Override
	public void run() {
		System.out.println("inside run with "+Thread.currentThread().getName()+" with priority "+Thread.currentThread().getPriority());
			
		
	}

	public static void main(String[] args) {
		
		Main m1= new Main();
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m1);
		
		
		
		t1.setPriority(8);
		t2.setPriority(10);
		t1.setName("Dhoni");
		t2.setName("kohli");
		t1.start();
		t2.start();
		
		
	}

}
