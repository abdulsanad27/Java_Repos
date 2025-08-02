package abstarct;

public class TEST3 {
	public static void main(String[] args) {
		Smartphone s = new Smartphone("red","ipn",1000);	
	}	

}
abstract class  Mobile {
	String brand;
	int price;
	Mobile(String brand,int price){
		this.brand=brand;
		this.price=price;
	}
}
class Smartphone extends Mobile{
	String colour;
	Smartphone(String colour,String brand,int price){
		super(brand,price);
		this.colour=colour;
	}
}
