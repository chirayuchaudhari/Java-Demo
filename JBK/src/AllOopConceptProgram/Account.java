package AllOopConceptProgram;

public abstract class Account {
	long id;
	String name;
	double balance;
	
	abstract void deposit(double amount);
	abstract void withdraw(double amount) throws MinBalanceException ;

	public Account(long id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public void Showbalance(){
		System.out.println("Total balance"+balance);
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
}
