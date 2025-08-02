package contactor;

public class Test {
	public static void main(String[] args) {
		Constctor cn = new Constctor();
		System.out.println(cn.name);
		System.out.println(cn.id);
		System.out.println(cn.number);
		
		Constctor cn2 = new Constctor("sanad",101,9148776458l);
		System.out.println(cn2.name);
		System.out.println(cn2.id);
		System.out.println(cn2.number);
		
	}

}
