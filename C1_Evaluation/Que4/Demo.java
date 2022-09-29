package C1_Evaluation.Que4;



public class Demo {
	
	
	public static void main(String[] args) {
		{
			try
			{
			System.out.print("A");
			int num = 99/0;
			System.out.print("B");
			}
			catch(ArithmeticException ex)
			{
//			System.out.print("C");
				System.out.println(ex.getMessage());
			}
			catch(Exception ex)
			{
			System.out.print("D");
				System.out.println(ex.getMessage());
			}
			System.out.print("E");
			}
			
		
	}

}
