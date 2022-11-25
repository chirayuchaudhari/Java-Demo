package AllOopConceptProgram;

public class Test {

	public static void main(String[] args)  {
		SavingAccount sa=new SavingAccount(101,"Chirayu",5000 );
		System.out.println(sa);
		
		try {
			sa.withdraw(4050);
		} catch (MinBalanceException e) {
			e.printStackTrace();
		}
		System.out.println(sa);
	}
}
