package Basics;

public class Demo {

	public static void main(String[] args) {
		String[] s= new String[10];
		for (int i = 1; i <= s.length; i++)
		{
			if(i%4==0)
			{
				System.out.print("Hello"+" ");
			}
			else if(i%10==0) 
			{
				System.out.print("Bye Bye"+" ");
			}
			else {
				System.out.print(i+" ");
			}	
		}
	}
}
