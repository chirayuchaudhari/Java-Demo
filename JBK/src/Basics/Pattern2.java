package Basics;

public class Pattern2 {

	public static void main(String[] args) {
		
			for (int i = 0; i < 2; i++) 
			{
				for (int j = 0; j <2; j++)
				{
					if(j==0)
						System.out.print("*");
					else
						System.out.print("@");	
				}
				System.out.println();
			}
	}

}
