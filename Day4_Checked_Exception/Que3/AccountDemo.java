package Day4_Checked_Exception.Que3;

public class AccountDemo {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.accountNumber = "ABC10101";
		account.balance = 500 ; 
		account.deposite(850);
		try {
			double withdraw = account.withdraw(1500);
			System.out.println("acc balance is "+account.balance);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
