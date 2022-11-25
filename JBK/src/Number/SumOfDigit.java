package Number;

public class SumOfDigit {

	public static void main(String[] args) {
		int n=555;
		int rem=0,sum=0;
		
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum of Digit= "+sum);

	}

}
