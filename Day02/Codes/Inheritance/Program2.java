/*
	============= Java Language =============

	Inheritance ->

	* In Inheritance,Parent and Child relation is Compulsory.
	* To Make the Parent and Child Relation,'extends' keyword is Necessary.
	ex:
		class Parent{

		}
		class Child extends Parent{

		}

	Types of Inheritance :-

	1) Single Inheritance :-
		* In single inheritance,a sub-class is derived from only one super class.
		* It inherits the properties and behavior of a single-parent class.
		ex : A
		     |
		     B
		    ‘A’ is a parent class and ‘B’ is a child class.
		    The Class 'B' inherits all properties of the class 'A'.
*/	
class Parent{

	void method1(){
		System.out.println("In Method1");
	}

	static void method2(){
		System.out.println("In Method2");
	}
}
class Child extends Parent{//The Child class is child of Parent class so we can access the methods of parent class.

	void method3(){

		System.out.println("In Method3");
	}
}
class Main{

	public static void main(String[] args){

		Child obj = new Child();
		obj.method1();	//Method of Parent
		obj.method2();	//Method of Parent
		obj.method3();	//Method of Child
	}
}
/* Output :
 	
	In Method1
	In Method2
	In Method3
*/
