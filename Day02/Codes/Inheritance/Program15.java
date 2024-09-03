/*
	============= Java Language =============

	Inheritance ->

	Practice Code 7:
*/	
class Parent{

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
		obj1.method1();	
		Child obj2 = new Child();
		obj2.method1();

	}
}
/* Error :-

Program15.java:18: error: cannot find symbol
                System.out.println("A : " + a);
                                            ^
  symbol:   variable a
  location: class Parent
Program15.java:19: error: cannot find symbol
                System.out.println("B : " + b);
                                            ^
  symbol:   variable b
  location: class Parent
2 errors
   
*/
   	
