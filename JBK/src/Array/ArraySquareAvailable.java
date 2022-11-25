package Array;

public class ArraySquareAvailable {

	public static void main(String[] args) {
		int a[]= {3,5,2,9,4,125};
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]*a[i]==a[j])
				{
					System.out.println(a[i]);
				}
				
			}
		}
		
		

	}

}
