package Array;

public class Array11 {

	public static void main(String[] args) {
		int a[]= {3,5,4,3,5,2,7,4,11};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
		
	}

}
