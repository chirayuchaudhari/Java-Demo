package Array;

public class ArraySumofOddNo {

	public static void main(String[] args) {
		int a[]= {11,20,-8,33,17};
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2!=0)
			{
				sum=sum+a[i];
			}
			
		}
		System.out.println(sum);

	}

}
