package Thread;

public class C extends Thread{
	
	@Override
	public void run() {
		for (int i = 1; i <=100; i++) {
			if(i%5==0)
			{
				System.out.println(i+getName());
			}
			
		}
	}
}
