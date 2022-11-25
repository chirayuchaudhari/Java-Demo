package Array;

public class ArrayCreation {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		//print array type 1
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();
		
		//print array type 2
		for (int t : a) {
			System.out.print(t + " ");
		}
		System.out.println();
		System.out.println("Array Length= " + a.length);
	}

}
