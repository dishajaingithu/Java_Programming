/*
	============= Java Language =============

	Inheritance ->
*/

class Parent{

	Parent(){

		System.out.println("In Parent Constructor");
	}
	void method1(){
		System.out.println("In Method - M1");
	}
}
class Child extends Parent{

	Child(){

		System.out.println("In Child Constructor");
	}
	void method2(){
		System.out.println("In Mathod - M2");
	}
}
class Demo{
	public static void main(String[] args){

		Parent p = new Parent();
		p.method1();
		//p.method2();	//Error : Cannot find Symbol

		Child c = new Child();
		c.method1();
		c.method2();

		Parent p1 = new Child();
		p1.method1();
		//p1.method2();	//Error : Cannot find Symbol
	}
}
/* Output :
	
   	In Parent Constructor
	In Method - M1
	In Parent Constructor
	In Child Constructor
	In Method - M1
	In Mathod - M2
	In Parent Constructor
	In Child Constructor
	In Method - M1
*/
