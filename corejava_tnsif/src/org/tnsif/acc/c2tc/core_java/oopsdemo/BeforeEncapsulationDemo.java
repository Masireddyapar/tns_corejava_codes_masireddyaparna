package org.tnsif.acc.c2tc.core_java.oopsdemo;

class Human
{
	 int age;
	 String name;
}

public class BeforeEncapsulationDemo {
	
	public static void main(String[] args) {
		Human obj= new Human();
		obj.age=22;
		obj.name="santosh";
//		obj.age=23;
//		obj.name="hema";
		System.out.println(obj.age);
		System.out.println();
		System.out.println(obj.name);

	}

}