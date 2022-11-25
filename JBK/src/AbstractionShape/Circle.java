package AbstractionShape;

public class Circle extends Shape{
	
	void area()
	{
		int r=3;
		double pi=3.14;
		double result=pi*r*r;
		System.out.println("Area of Circle= "+result);
	}
}
