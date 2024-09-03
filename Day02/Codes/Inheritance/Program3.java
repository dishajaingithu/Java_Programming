/*
	============= Java Language =============

	Inheritance ->

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

	Parent(){

		System.out.println("In Parent Constructor : " + this);
	}
}
class Child extends Parent{

	Child(){

		System.out.println("In Child Constructor : " + this);
	}
}
class Main{

	public static void main(String[] args){

		Child obj = new Child();
	}
}
/* Output :
	
   	In Parent Constructor : Child@2f92e0f4
	In Child Constructor : Child@2f92e0f4

Explanation :

* We make the object of child so implicitly calls go to child contructor.
* But In Child Constructor,their is super() to call their Parent Contructor so the calls go to the Parent Constructor* That's why they print first 'In Parent Constructor' and then 'Child Constructor'.
*/
