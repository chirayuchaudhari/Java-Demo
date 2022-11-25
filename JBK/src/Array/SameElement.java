package Array;

public class SameElement {

	public static void main(String[] args) {
		int a[]= {1,5,7,9,10,4,3,11};
		int b[]= {5,9,10,4,3,12,11,32};
		System.out.print("Same Element From Both Array= ");
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < b.length; j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}
