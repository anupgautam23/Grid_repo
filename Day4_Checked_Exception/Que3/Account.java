package Day4_Checked_Exception.Que3;

import java.security.PublicKey;

public class Account {
	String  accountNumber; 
	double balance;
	
	public  void deposite(int amount) {
		balance=balance+amount;
		System.out.println("account deposite "+amount);
		
		System.out.println("total balance "+balance);
	}
	
	public  double withdraw(int  amount) throws InsufficientFundsException {
		
		if(amount<balance) {
			
			balance =balance-amount ;
			System.out.println(amount+" withdraw successfull");
		}else {
			throw new InsufficientFundsException("You Have Insufficient balance please enter ammoutn below "+balance);
			
		}
		
		
		return balance;
		
	}


}
