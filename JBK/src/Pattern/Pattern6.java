package Pattern;

public class Pattern6 {

	public static void main(String[] args) {
		for (int i = 0; i <=7; i++)
		{
			for (int j =0; j<=4; j++)
			{
				if(i%2==0)
				{
					System.out.print("@ ");
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
