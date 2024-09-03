/*
	============= Java Language =============

	Inheritance ->

	Practice Code 6:
*/	
class Parent{

	static int a = 10;
	int b = 20;

	static{
		System.out.println("In Parent Static Block");
	}
	Parent(){
		System.out.println("In Parent Constructor");
	}

	void method1(){
		System.out.println("A : " + a);
		System.out.println("B : " + b);
	}
}
class Child extends Parent{

	static int a = 30;
	int b = 40;
	
	static{
		System.out.println("In Child Static Block");
	}
	Child(){
		System.out.println("In Child Constructor");
	}
}
class Demo{

	public static void main(String[] args){

		Parent obj1 = new Parent();
		Child obj2 = new Child();
		obj2.method1();

	}
}
/* Output :-
   
   	In Parent Static Block
	In Parent Constructor
	In Child Static Block
	In Parent Constructor
	In Child Constructor
	A : 10	//Compile Time Binding
	B : 20	//Compile Time Binding
*/
   	
