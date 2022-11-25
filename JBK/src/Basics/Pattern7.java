package Basics;

public class Pattern7 {

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) 
		{
			for (int j = 0; j < 2; j++)
			{
				if(i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("@");
				}
			}
			System.out.println();
		}
	}
}
