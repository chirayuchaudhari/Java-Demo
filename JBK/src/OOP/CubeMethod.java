package OOP;

public class CubeMethod {
	
	static int cube_method(int a)
	{
		int c=a*a*a;
		return c;
	}
	public static void main(String[] args) {
		int d=cube_method(3);
		System.out.println("Cube of given Number= "+d);
	}

}
