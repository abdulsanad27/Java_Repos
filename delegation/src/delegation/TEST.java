package delegation;

public class TEST {
	public static void main(String[] args) {
		Mobile m = new Mobile();
		Charger c = new Charger("ipon");
		m.hasa(c);
//		m.o.chechos();
//		c.getCharger();
		m=null;
//		m.o.chechos();
		c.getCharger();
	}

}
