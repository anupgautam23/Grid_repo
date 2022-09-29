package C3_Evaluation.Que4;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		
		
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(b1);
		Thread t3 = new Thread(c1);
		t1.setName("Dhoni");
		t1.setPriority(10);
		
		t2.setName("Rohit");
		t2.setPriority(9);		
		t3.setName("Kohli");
		t3.setPriority(8);		
		t1.start();		
		t2.start();
		
		synchronized (t2) {			
			t2.wait();
		}
		
		t3.start();
			

	}

}
