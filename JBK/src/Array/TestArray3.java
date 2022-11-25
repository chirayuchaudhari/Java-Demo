package Array;

public class TestArray3 {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {1,2,3,4};
		for (int i = 0; i < b.length; i++) 
		{
			if(a[i]==b[i])
				System.out.println("same");
			else
				System.out.println("not");
		}
		
		
	}

}
