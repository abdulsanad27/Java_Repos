package abstarct;// abstract with incompleete method in super class
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		square sq = new square();
		rectrangle req = new rectrangle();
		circle cir = new circle();
		geometry go = new geometry();
		go.alowshap(sq);
		go.alowshap(req);
		go.alowshap(cir);
		go.alowshap(sq);
	}
}
  abstract class shape{
	 public float area;
	 abstract void input();
	 abstract void calarea();
	  void disp() {
		  System.out.println(area);
	  }
 }
  class square extends shape{
	  float l;
	  @Override
	  void input(){
		  Scanner s = new Scanner(System.in);
		  System.out.println("enter the length of square");
		   l=s.nextFloat();
	  }
	  @Override
	  void calarea() {
		  area=l*l;  
	  }
  }
  class rectrangle extends shape{
	  float l;
	  float b;
	  @Override
	  void input() {
		  Scanner s1 = new Scanner(System.in);
		  System.out.println("enter the length of reqtangle");
		  l=s1.nextFloat();
		  Scanner s2 = new Scanner(System.in);
		  System.out.println("enter the b of rectangel");
		  b=s2.nextFloat();
	  }
	  @Override
	  void calarea() {
		  area=l*b;
	  }
  }
  class circle extends shape{
	  float r;
	  float pai=3.14f;
	  @Override
	  void input() {
		  Scanner s3 = new Scanner(System.in);
		  System.out.println("enter the radius of circle");
		  r=s3.nextFloat();
	  }
	  void calarea() {
		  area=pai*r*r;
	  }
  }
  class geometry{
	  void alowshap(shape ver) {
		  ver.input();
		  ver.calarea();
		  ver.disp();
	  }
  }
