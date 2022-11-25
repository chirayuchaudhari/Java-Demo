package Basics;

public class PrimeOrNot {

	public static void main(String[] args) {
		int n=11;
		boolean isPrime=true;
		for (int i = 2; i < n-1; i++)
		{
			if(n%i==0)
			{
				isPrime=false;
			}
		}
		if(isPrime)
			System.out.println(n+" is Prime Number");
		else
			System.out.println(n+" is Not Prime Number");
	}
}
