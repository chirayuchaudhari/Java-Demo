package OOP;

public class AllArithmaticMethod {

	static int add_method(int a,int b)
	{
		int c=a+b;
		return c;
	}
	static int sub_method(int a,int b)
	{
		int c=a-b;
		return c;
	}
	static int div_method(int a,int b)
	{
		int c=a/b;
		return c;
	}
	static int mult_method(int a,int b)
	{
		int c=a*b;
		return c;
	}
	public static void main(String[] args) {
		int x=add_method(10,20);
		System.out.println("Addition= "+x);
		
		int y=sub_method(30,20);
		System.out.println("Substraction= "+y);
		
		int z=div_method(10,5);
		System.out.println("Division= "+z);
		
		int p=mult_method(10,20);
		System.out.println("Multiplication= "+p);

	}

}
