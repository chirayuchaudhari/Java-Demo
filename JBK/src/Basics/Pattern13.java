package Basics;

public class Pattern13 {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j < 4; j++) 
			{
				if(i<2 && j<2)
				{
					System.out.print("("+i+","+j+")");
				}
				else if(i<=1 && j<=3)
				{
					System.out.print("("+i+","+j+")");
				}
				else if(i>=1 && j<=1) 
				{
					System.out.print("("+i+","+j+")");
				}
				else
				{
					System.out.print("("+i+","+j+")");
				}
			}
			System.out.println();
		}
		
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j < 4; j++) 
			{
				if(i<2 && j<2)
				{
					System.out.print("* ");
				}
				else if(i<=1 && j<=3)
				{
					System.out.print("@ ");
				}
				else if(i>=1 && j<=1) 
				{
					System.out.print("# ");
				}
				else
				{
					System.out.print("1 ");
				}
			}
			System.out.println();
		}

	}

}
