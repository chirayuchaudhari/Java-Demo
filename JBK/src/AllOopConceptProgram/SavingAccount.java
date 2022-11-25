package AllOopConceptProgram;

public class SavingAccount extends Account{

	public SavingAccount(long id, String name, double balance) {
		super(id, name, balance);
		
	}

	@Override
	void deposit(double amount1) {
		if(balance-amount1>0)
		balance=balance+amount1;
		
	}
	
	@Override
	public void withdraw(double amount1)throws MinBalanceException  {
		if(balance-amount1<Constants.MIN_BALANCE) {
			throw new MinBalanceException();	
	}
		
	balance=balance-amount1;
	}	
}
