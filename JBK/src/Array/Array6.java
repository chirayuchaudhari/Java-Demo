package Array;

public class Array6 {

	public static void main(String[] args) {
		char a[]=new char[7];
		a[0]='c';
		a[1]='h';
		a[2]='i';
		a[3]='r';
		a[4]='a';
		a[5]='y';
		a[6]='u';
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.print(a[0]+" ");
		System.out.print(a[1]+" ");
		System.out.print(a[2]+" ");
		System.out.print(a[3]+" ");
		System.out.print(a[4]+" ");
		System.out.print(a[5]+" ");
		System.out.println(a[6]+" ");
		
		
		char c[]= {'c','h','i','r','a','y','u'};
		for (int i = 0; i < c.length; i++) 
		{
			System.out.print(c[i]+" ");
		}

	}

}
