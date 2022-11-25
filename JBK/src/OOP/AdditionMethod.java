package OOP;

public class AdditionMethod {
	static int addition_method(int number1,int number2)
	{
		int addition= number1+ number2;
		return addition;
	}

	public static void main(String[] args)
	{
		int result=addition_method(10, 20);
		System.out.println("Addition of given number= "+result);

	}

}
