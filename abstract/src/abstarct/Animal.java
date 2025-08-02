package abstarct;

class CastDemo  {
    void sound() { System.out.println("Generic"); }
}
class Dog extends CastDemo {
    void sound() { System.out.println("Bark"); }
    void fetch() { System.out.println("Fetch"); }
}
public class Animal {
    public static void main(String[] args) {
    	CastDemo  a = new Dog();
        ((Dog)a).fetch();
        CastDemo b = new CastDemo ();
        b.sound();
        a.sound();
        
//        a.fetch();
    }
}
