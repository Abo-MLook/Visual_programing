/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics_oop;

/**
 *
 * @author memom
 */


//******************************************main start
public class Inheritance__L6 {

	public static void main(String[] args) {
		
		
		
		Hero hero1 = new Hero("Batman",42,"$$$");
		Hero hero2 = new Hero("Superman",43,"everything");
		
		System.out.println(hero2.toString());
		
	}
}



//******************************************class start
 class Person {


	String name;
	int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return this.name + "\n" + this.age + "\n";
	}
	
}//******************************************class end



//******************************************class start
//Inhertiance
// super = 	keyword refers to the superclass (parent) of an object
		//			very similar to the "this" keyword
 class Hero extends Person{


	String power;
	
	Hero(String name,int age,String power){	
		super(name,age);
		this.power = power;
	}
	
	public String toString() {
		return super.toString()+this.power;
	}
}//******************************************class end