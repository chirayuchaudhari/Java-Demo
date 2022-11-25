package Array;

public class TestArray8 {

	public static void main(String[] args) {
		int a [][]= {{10,20},{30,40}};
		
		//i for row index
		for (int i = 0; i < a.length; i++)
		{
			//j for column index
			for (int j = 0; j < a.length; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
