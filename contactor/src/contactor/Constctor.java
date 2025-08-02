package contactor;

public class Constctor {
	String name;
	int id;
	long number;
	
	Constctor(){
		name= "no input";
		id=0;
		number=0l;
	
	}
	Constctor(String name , int id,long number){
		this.name=name;
		this.id=id;
		this.number=number;
	}
	
}
