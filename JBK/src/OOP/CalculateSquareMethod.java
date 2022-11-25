package OOP;


public class CalculateSquareMethod {
	
	static int cal_square(int number)
	{
		int ans=number*number;
		return ans;
	}
	public static void main(String[] args)
	{
		int result=cal_square(9);
		System.out.println("Square of given Number= "+result);
		

	}

}
