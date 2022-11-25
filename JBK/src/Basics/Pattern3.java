package Basics;

public class Pattern3 {

	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++)
		{
			for (int j = 0; j <= 9; j++) 
			{
				if(i+j>=9 || j-i<=0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}		
			}
			System.out.println();
		}
	}
}
