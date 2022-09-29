package C1_Evaluation.Que3;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	public static void  doTransactions(List<? extends Payment> newlist ) {

		for(Payment list:newlist) {

			list.doPayment();
		}
	}

	public static void main(String[] args) {
		
		ArrayList<CardPayment> cardlist = new ArrayList<>();
		cardlist.add(new CardPayment(8000));
		cardlist.add(new CardPayment(7000));
		doTransactions(cardlist);
		
		

		ArrayList<CashPayment> cashlist = new ArrayList<>();
		cashlist.add(new CashPayment(6000));
		cashlist.add(new CashPayment(9000));
		doTransactions(cashlist);
	
		
		
	}

}
