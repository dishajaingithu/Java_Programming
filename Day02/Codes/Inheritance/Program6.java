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
		Child obj = new Child();
		//System.out.println(super.a);//Error:non-static variable super cannot be refer from a static context
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.x);
		System.out.println(Parent.y);
	}
}
/* Output :
	
   	In Static Block : Parent
	In Static Block : Child
	In Parent Constructor : Child@2f92e0f4
	In Child Constructor : Child@2f92e0f4
	30
	40
	10
	20
*/
