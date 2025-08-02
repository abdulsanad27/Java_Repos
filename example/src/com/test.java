package com;

public class test {
	
	 static String name;
	int age;
	public  test(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return age+""+name+"";
		}

	public static void main(String[] args) {
		test t = new test("abdul", 0);
		System.out.println(t);
	}

	
	
	
	
	
	

}
