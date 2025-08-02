package delegation;

public class Mobile {
	OS o = new OS();
	Mobile(){
		System.out.println("mobile is created with os installed");
	}
	void hasa(Charger ch) {
		System.out.println("charger accuerd");
		System.out.println("charger used for charging ");
	}
}
