package Method;

import java.util.Scanner;

public class Account {
	
	int balance=1000;
	
	
	void deposit(int a)
	{	
		balance=balance+a;	
	}
	
	void withdraw(int b)
	{
		balance=balance-b;	
	}
	public static void main(String[] args) 
	{
		int balance=1000;
		System.out.println("account balance= "+balance);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter amount= ");
		int a=sc.nextInt();
		
		Account ac=new Account();
		ac.deposit(a);
		
		System.out.println("After deposit= "+ac.balance);
		
		System.out.print("Enter amount= ");
		int b=sc.nextInt();
			
		ac.withdraw(b);
		System.out.print("After withdrawal= "+ac.balance);

	}

}
