package abstarct;//abstract having canstractor 

public class TEST2 {
	public static void main(String[] args) {
		smartphone s = new smartphone();
		s.switchon();
	}


}
abstract class mobile{
	abstract void switchon();
	mobile(){
		System.out.println("mobile const is used");
	}
}
class smartphone extends mobile{
	@Override
	void switchon() {
		System.out.println("smartphne is on");
	}
	smartphone(){
		super();
		System.out.println("smartpone cants is used");
	}
}

