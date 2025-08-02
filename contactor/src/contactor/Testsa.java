package contactor;

class test1{
	static int count=0;
	void ver() {
		count++;
	}
}
		
	

public class Testsa {
	public static void main(String[] args) {
		test1 ts = new test1();
		ts.ver();
		ts.ver();
		ts.ver();
		ts.ver();
		ts.ver();
		ts.ver();
		System.out.println(ts.count);
	}
}