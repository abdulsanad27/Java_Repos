package abstarct;

public class TEST4 {
	public static void main(String[] args) {
		Crow c = new Crow();
		c.fly();
		c.eat();
		Sproow s = new Sproow();
		s.eat();
		s.fly();
		GoldenEagle g = new GoldenEagle();
		g.eat();
		g.fly();
		SerpentEagle se = new SerpentEagle();
		se.eat();
		se.fly();
		
	}

}
abstract class Bird{
	abstract void fly();
	abstract void eat();
}
class Sproow extends Bird{
	@Override
	void fly() {
		System.out.println("sprrow fly at 50htf");
	}
	@Override
	void eat() {
		System.out.println("sprrow eats ari");
	}
}
abstract class Eagle extends Bird{
}
 class Crow extends Bird{
	@Override
	void fly() {
		System.out.println("Crow fly at 80ft");
	}
	void eat() {
		System.out.println("Crow eats fish");
	}
}
 class GoldenEagle extends Eagle{
		@Override
		void fly() {
			System.out.println("eagle fly at 500ft");
		}
	@Override
	void eat() {
		System.out.println("goldeneagle eats snake");
	}
}
 class SerpentEagle extends Eagle{
		@Override
		void fly() {
			System.out.println("eagle fly at 500ft");
		}
	@Override
	void eat() {
		System.out.println("serpenteagle eats fish");
	}
}