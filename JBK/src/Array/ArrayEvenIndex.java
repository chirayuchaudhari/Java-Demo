package Array;

public class ArrayEvenIndex {

	public static void main(String[] args) {
		
		int a[]= {11,20,-8,33,17};
		for (int i = 0; i < a.length; i++) 
		{
			if((i%2==0)&&(a[i]%2==0))
			{
				System.out.println("Index= "+i);
				System.out.println("element= "+a[i]);
			}
		}

	}

}
