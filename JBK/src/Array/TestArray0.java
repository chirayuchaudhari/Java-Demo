package Array;

public class TestArray0 {

	public static void main(String[] args) {
	
	//// Array Print using For  loop	
	int a[]= {10,20,30};
	for (int i = 0; i < a.length; i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	
	
	int b[]= {40,50,60};
	for(int element:b)
	{
		System.out.print(element+" ");
	}
	}

}
