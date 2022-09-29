package Day5_LambdaFun.Que1;

public class Tiger extends Animal {

	public Tiger() throws AnimalException {
		super();
		
	}
	
	@Override
	void eat() throws AnimalException {
		System.out.println("Tiger is eating !!");
		
	}

	public static void main(String[] args) {
		
		try {
			Animal tiger =  new Tiger();
			tiger.eat();
		} catch (AnimalException e) {
			System.out.println(e.getMessage());
		}
		

	}

	

}
