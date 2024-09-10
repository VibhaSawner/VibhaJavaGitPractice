package javaPractice;

public class CountOfDebitCredit {

	int bal=10000;
	int debitCnt=0;
	int creditCnt=0;
	
	void debitData(int amt) {
		if(bal>amt) {
			bal= bal-amt;
			debitCnt=debitCnt+1;
			System.out.println(bal+" = balance is available ");
		}else {
			System.out.println("your requested amt is "+amt+" our available bal is "+bal);
		}
	}
	
	void creditData(int amt) {
		bal=bal+amt;
		creditCnt=creditCnt+1;
		System.out.println(bal+" = balance is credit");
	}
	
	void debitCount() {
		System.out.println("debit count is => "+debitCnt);
	}
	
	void creditCount() {
		System.out.println("credit count is => "+creditCnt);
	}
	
	public static void main(String[] args) {
		 CountOfDebitCredit  countOfDebitCredit=new  CountOfDebitCredit();
		 countOfDebitCredit.debitData(1000);
		 countOfDebitCredit.debitData(2000);
		 countOfDebitCredit.debitData(8000);
		 countOfDebitCredit.creditData(500);
		 countOfDebitCredit.creditData(500);
		 countOfDebitCredit.creditData(500);
		 countOfDebitCredit.creditData(500);
		 countOfDebitCredit.debitCount();
		 countOfDebitCredit.creditCount();
	}
}
