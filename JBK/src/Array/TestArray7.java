package Array;

public class TestArray7 {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		int b[]= {10,20,30};
		int c[]= new int[3];
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c.length; j++) 
			{
				c[i]=a[i]+b[i];
				
			}
			System.out.print(c[i]+" ");
		
		}
		

	}

}
