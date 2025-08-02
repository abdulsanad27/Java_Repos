package delegation;

public class PTEST {

}
class heart{
	public heart() {
		System.out.println("heart is creatd");
	}
	void checkheart() {
		System.out.println("heart is pumping");
	}
}
class brain{
	brain(){
		System.out.println("brain is created");
	}
	void checkbr(){
		System.out.println("brain thinnking");
	}
}
class mobile{
	mobile(){
		System.out.println("mobile created");
	}
	void checkmb() {
		System.out.println("mobile still working");
	}
}
class person{
	heart h = new heart();
	brain b = new  brain();
	person(){
		System.out.println("person is created with heart and brain");
	}
}

