package Day4_Checked_Exception.Que6;

public class Child extends Parent {

	Child() throws Exception {
		super();
		
	}

	public static void main(String[] args) {
		
		try {
			Child parent =  new Child();
			parent.fun1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
