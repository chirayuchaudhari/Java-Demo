package Pattern;

public class Pattern13 {

	public static void main(String[] args) {
		int counter=100;
		for (int i = 5; i <= 50; i=i+5)
		{
			System.out.print(i+" ");
			if(i%25==0)
			{
				System.out.print(counter+" ");
				counter=counter+100;
			}
			
		}
		


	}

}
