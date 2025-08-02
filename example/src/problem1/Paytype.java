package problem1;

public class Paytype {
	public static void main(String[] args) {
		UPI up = new UPI();
		Creaditcard cc = new Creaditcard();
		Paypal pp = new Paypal();
//		up.pay(1000);
//		up.UPI();
//		cc.pay(1000);
//		cc.Criditecard();
//		pp.pay(1000);
//		pp.Paypal();
		Amount a = new Amount();
		a.pay(500);
		ConsolLogger cl =new ConsolLogger();
		cl.log(up,a.pay(500));
		cl.log(up,a.pay(500));
		cl.log(up,a.pay(500));
		
		
	}

}
