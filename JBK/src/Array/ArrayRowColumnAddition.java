package Array;

public class ArrayRowColumnAddition {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		int sum=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(i==0 || j==1)
				{
					System.out.print(a[i][j]+" ");
					sum=sum+a[i][j];
				}
			}
		}
		System.out.print(sum);
		
	}
}
