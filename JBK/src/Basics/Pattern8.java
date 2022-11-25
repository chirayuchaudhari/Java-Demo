package Basics;

public class Pattern8 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) 
		{
			for (int j = 0; j < 10; j++) 
			{
				if((i+j<=4 ||j-i>=5) || (j-i<=-5 ||i+j>=14))//
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
