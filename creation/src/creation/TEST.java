package creation;

public class TEST {
	public static void main(String[] args) {
		Creature	 cw=new COW();
		
		cw.eat();
		cw.makesound();
		
		Creature	 dg=new DOG();
		dg.eat();
		dg.makesound();
		Creature	 sk=new Snake();
		sk.eat();
		sk.makesound();
	}

}
