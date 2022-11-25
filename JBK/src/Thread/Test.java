package Thread;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		
		A a=new A();
		a.start();
		a.setName(" Even Thread");
		a.join();
		
		
		B b=new B();
		b.start();
		b.setName(" Odd Thread");
		b.join();
		
		C c=new C();
		c.start();
		c.setName(" Divisible By 5 Thread");
		c.join();
	}
}
