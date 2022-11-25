package Array;

public class Pattern {

	public static void main(String[] args) {
		for (int i = 0; i <5; i++)
		{
			for (int j =0; j<5; j++)
			{
				if(i==0 || j%2==0 || i==4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("#");
				}
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		for (int i = 0; i <=4; i++)
		{
			for (int j =0; j<=4; j++)
			{
				if(i==0 || j%2==0 || i==2 || i==4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("# ");
				}
			}
			System.out.println();
		}
		
		

	}

}
