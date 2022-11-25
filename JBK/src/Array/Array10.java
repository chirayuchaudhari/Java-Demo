package Array;

public class Array10 {

	public static void main(String[] args) {
		double d[]= {10.0,20.0,30.0,40.0};
		double result=0;
		for (int i = 0; i < d.length; i++) 
		{
			result=result+d[i];	
		}
		System.out.println("avg is= "+result/4);
		
		
	}

}
