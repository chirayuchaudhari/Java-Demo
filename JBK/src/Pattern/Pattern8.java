package Pattern;

public class Pattern8 {

	public static void main(String[] args) {
		for (int i = 0; i <=7; i++)
		{
			for (int j =0; j<=4; j++)
			{
				if((i==0 || i==1) || (i==4 || i==5))
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
