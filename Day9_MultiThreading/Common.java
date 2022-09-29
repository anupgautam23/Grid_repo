package Day9_MultiThreading;

public class Common {

	public static synchronized void fun1(String name) {
		System.out.println("welcome");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name);
	}

}
