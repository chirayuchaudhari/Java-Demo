package OOP;

public class SubstractionMethod {
	static int substraction_method(int number1, int number2)
	{
		int number3=number1-number2;
		return number3;
	}
	
	public static void main(String[] args)
	{
		int result=substraction_method(10, 5);
		System.out.println("Substraction of Given number= "+result);

	}

}
