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

	int x = 10;
	static int y = 20;

	Parent(){

		System.out.println("In Parent Constructor : " + this);
	}

	static{
		System.out.println("In Static Block : Parent");
	}
}
class Child extends Parent{

	int a = 30;
	static int b = 40;

	Child(){

		System.out.println("In Child Constructor : " + this);
	}

	static{
		System.out.println("In Static Block : Child");
	}
}
class Main{

	public static void main(String[] args){

		Parent obj1 = new Parent();
		Child obj2 = new Child();
	}
}
/* Output :
	
   	In Static Block : Parent
	In Parent Constructor : Parent@372f7a8d
	In Static Block : Child
	In Parent Constructor : Child@28a418fc
	In Child Constructor : Child@28a418fc

Explanation :

* Call the static block of parent and then child because static block always come firts before 'main' also.
* Firstly We make the object of Parent so implicitly calls go to Parent contructor.
* Then we make the object of Child so implicitly calls go to the Child Constructor.
* But In Child Constructor,their is super() to call their Parent Contructor so the calls go to the Parent Constructor* That's why they print first 'In Parent Constructor : Parent@372f7a8d'.
			      'In Parent Constructor : Child@28a418fc.
			      'In Child Constructot : Child@28a418fc.
*/
