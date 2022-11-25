package Number;

public class CountDigit {

	public static void main(String[] args) {
		int n=123456789;
		int count=0;
		int rem=0;
		while(n>0)
		{
			rem=n%10;
			count++;
			n=n/10;
		}
		System.out.println("Count of Digit= "+count);
	}

}
