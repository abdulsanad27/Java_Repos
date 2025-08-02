package learn;

public class callinng {
	 int a=100;
	void s() {
		int b=200;
		System.out.println(b);
		a=b;
//		return b;
	}
	int d() {
		
		return a;
	}
	
//	a=2100;
	public static void main(String[] args) {
//	 System.out.println(callinng.a);
//	 System.out.println(a);
	 callinng ch = new callinng();
	 ch.s();
	 System.out.println(ch.a);
	 call c= new call();
	 System.out.println(c.k);
	 System.out.println(ch.d());		
	}
    
}
class call{
	int k=500;
	callinng ch = new callinng();
//	int a=ch.s();
	{
//		System.out.println("Sum is = " +(k+a));
	}
}
