package AbstractionBird;

public class Main {

	public static void main(String[] args) {
		Parrot p=new Parrot();
		p.fly();
		p.eat();
		p.color();
		
		Duck d=new Duck();
		d.fly();
		d.eat();
		d.color();

	}

}
