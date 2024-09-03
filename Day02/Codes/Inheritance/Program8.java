/*
	============= Java Language =============

	Inheritance ->
 
	3) Hierarchical Inheritance
		* In Hierarchical Inheritance, one class serves as a superclass (base class)
		  for more than one subclass.
		* class A serves as a base class for the derived classes B, C, and D.
		ex : 		A -> 		Base Class
			|	|	|
			B	C	D	Derived Class
*/

class Parent{
	int x = 10;
	static int y = 20;
	Parent(){

		System.out.println("In Parent Constructor");
	}
}
class Child1 extends Parent{
	int a = 30;
	static int b = 40;
	Child1(){
		
		System.out.println("In Child 1 Constructor");
	}
}
class Child2 extends Parent{
	int p = 50;
	static int q = 60;
	Child2(){

		System.out.println("In Child 2 Constructor");
	}
}
class Main{
	public static void main(String[] args){

		Child1 obj1 = new Child1();
		Child2 obj2 = new Child2();
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		//System.out.println(obj1.p);	 //error: cannot find symbol	
		//System.out.println(obj1.q);	 //error: cannot find symbol
		System.out.println(obj2.p);
		System.out.println(obj2.q);
	}
}
/* Output ->
	
   	In Parent Constructor
	In Child 1 Constructor
	In Parent Constructor
	In Child 2 Constructor
	10
	20
	30
	40
	50
	60
*/
